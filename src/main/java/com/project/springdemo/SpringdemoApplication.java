package com.project.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.springdemo.controller.GreetingController;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
		
		
		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
		
		System.out.println(greetingController.sayHello());

	}
}
