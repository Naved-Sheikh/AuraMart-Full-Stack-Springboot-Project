package com.ecom.config;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.ecom.model.UserDtls;
import com.ecom.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomOAuth2SuccessHandler implements AuthenticationSuccessHandler {

	@Autowired
	private UserService userService;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken) authentication;
		OAuth2User oauthUser = oauthToken.getPrincipal();

		// Get Google Data
		String email = oauthUser.getAttribute("email");
		String name = oauthUser.getAttribute("name");

		// Check if user is in our database, if not, save them!
		UserDtls user = userService.getUserByEmail(email);
		if (user == null) {
			user = userService.saveGoogleUser(email, name);
		}

		// THE MAGIC FIX: We manually assign the 'ROLE_USER' badge to this Google session
		GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
		
		// Create a new security token with the correct Role
		Authentication newAuth = new UsernamePasswordAuthenticationToken(user.getEmail(), null, List.of(authority));
		
		// Replace the generic Google token with our new powerful token
		SecurityContextHolder.getContext().setAuthentication(newAuth);

		// Redirect to homepage
		response.sendRedirect("/");
	}
}