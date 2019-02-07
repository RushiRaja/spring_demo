package com.project.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterbasedInjection {

	private HelloWorldService helloWorldService;

	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public void getMessage() {
		helloWorldService.sayHello();
	}
}
