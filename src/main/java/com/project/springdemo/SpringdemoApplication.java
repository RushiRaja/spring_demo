package com.project.springdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.springdemo.controller.GreetingController;

@SpringBootApplication
public class SpringdemoApplication {

	private static final Logger logger = LogManager.getLogger(SpringdemoApplication.class);
	
	public static void main(String[] args) {

		logger.info("START SpringdemoApplication.main()");
		
		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
		
		
		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
		
		System.out.println(greetingController.sayHello());
		
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
 
		logger.info("END SpringdemoApplication.main()");

	}
}
