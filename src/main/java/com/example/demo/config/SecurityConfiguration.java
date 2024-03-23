package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration {
	//bean is used to indicate that method initantiate, configures & 
    //initialize a new object to be mnged by spring IOC container
	@Bean
public PasswordEncoder passwordEncoder()
	{
	return new BCryptPasswordEncoder();
}
}