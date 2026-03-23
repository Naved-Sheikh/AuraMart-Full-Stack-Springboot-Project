package com.ecom.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.ecom.model.UserDtls;
import com.ecom.service.UserService;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

	@Autowired
	private UserService userService;

	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		OAuth2User oAuth2User = super.loadUser(userRequest);
		
		String email = oAuth2User.getAttribute("email");
		String name = oAuth2User.getAttribute("name");
		
		// 1. Save user if they are new
		UserDtls user = userService.getUserByEmail(email);
		if (user == null) {
			user = userService.saveGoogleUser(email, name);
		}
		
		// 2. Grant them the official ROLE_USER badge
		GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
		
		// 3. MAGIC TRICK: The "email" at the end forces Spring to use your email as your username!
		return new DefaultOAuth2User(List.of(authority), oAuth2User.getAttributes(), "email");
	}
}