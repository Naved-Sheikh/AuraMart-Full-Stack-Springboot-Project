package com.ecom.config;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

@Configuration
public class AwsConfig {
	
    @Value("${aws.access.key}")	
	private String accessKey;

    @Value("${aws.secret.key}")
    private String secrateKey;
    
    @Value("${aws.region}")
    private String region;
    
   @Bean
    public AmazonS3 amazonS3() {
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey,secrateKey);
      	return AmazonS3Client.builder().withRegion(region).withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
  
    }
}
    

