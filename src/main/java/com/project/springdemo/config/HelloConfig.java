package com.project.springdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.springdemo.services.HelloWorldEnglishImpl;
import com.project.springdemo.services.HelloWorldService;
import com.project.springdemo.services.HelloWorldSpanishImpl;

/**
 * 
 * @author Rushiraja
 *
 */
@Configuration
public class HelloConfig {
	
    private final Logger logger = LoggerFactory.getLogger(HelloConfig.class);
    
	@Bean
	@Profile({"defult","english"})
	public HelloWorldService helloWorldServiceEnglish() {
		logger.debug("Loading the properties from the \"english\" profile");
		return new HelloWorldEnglishImpl();

	}

	@Bean
	@Profile("spanish")
	public HelloWorldService helloWorldServiceSpanish() {
		logger.debug("Loading the properties from the \"spanish\" profile");
		return new HelloWorldSpanishImpl();

	}
}
