package com.project.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project.springdemo.services.HelloWorldService;

/**
 * @author Rushiraja Feb 7, 2019 6:55:46 AM
 */
@Controller
public class GreetingController {

	private HelloWorldService helloWorldService;

	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public String sayHello() {
		return helloWorldService.getGreetings();
	}
}
