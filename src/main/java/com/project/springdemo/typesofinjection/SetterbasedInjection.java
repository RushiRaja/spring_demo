package com.project.springdemo.typesofinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.springdemo.services.HelloWorldService;

@Component
public class SetterbasedInjection {

	private HelloWorldService helloWorldService;

	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public void getMessage() {
		helloWorldService.getGreetings();
	}
}
