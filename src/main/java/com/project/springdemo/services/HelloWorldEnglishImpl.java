package com.project.springdemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Rushiraja
 *
 */
@Component
@Profile({"english","default"})
public class HelloWorldEnglishImpl implements HelloWorldService {

	@Override
	public String getGreetings() {

		return "Hello World !!!";
	}
}
