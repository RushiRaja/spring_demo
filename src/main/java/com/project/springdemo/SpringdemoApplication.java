package com.project.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
		
		// Example of creating a bean and then using that bean to print hello World
		HelloWorldImpl helloWorldImpl = (HelloWorldImpl) ctx.getBean("helloWorldImpl");
		helloWorldImpl.sayHello();
		
		// Example to show the Constructor based injection
		InjectedByConsturctorService injectedByConsturctorService = (InjectedByConsturctorService) ctx.getBean("injectedByConsturctorService");
		injectedByConsturctorService.getMessage();
		
		// Example to show the Setter based injection
		SetterbasedInjection setterbasedInjection = (SetterbasedInjection) ctx.getBean("setterbasedInjection");
		setterbasedInjection.getMessage();
	}
}
