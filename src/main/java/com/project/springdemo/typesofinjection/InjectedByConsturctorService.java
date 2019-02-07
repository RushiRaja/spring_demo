package com.project.springdemo.typesofinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.springdemo.services.HelloWorldService;

@Component
public class InjectedByConsturctorService {

	
	private HelloWorldService helloWorldService;

	@Autowired
	public InjectedByConsturctorService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void getMessage() {
		helloWorldService.getGreetings();
	}
	
	
}
