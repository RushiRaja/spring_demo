package com.project.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConsturctorService {

	
	private HelloWorldService helloWorldService;

	@Autowired
	public InjectedByConsturctorService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void getMessage() {
		helloWorldService.sayHello();
	}
	
	
}
