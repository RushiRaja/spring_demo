package com.project.springdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	private static final Logger logger = LogManager.getLogger(SpringdemoApplication.class);
	
	public static void main(String[] args) {

		logger.info("START SpringdemoApplication.main()");
		
		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
	
	}
}
