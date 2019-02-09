package com.project.springmvc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

	private static final Logger logger = LogManager.getLogger(SpringdemoApplication.class);
	
	public static void main(String[] args) {

		logger.info("START SpringdemoApplication.main()");
		
		SpringApplication.run(SpringdemoApplication.class, args);
		
	}
}
