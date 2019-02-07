/**
 * 
 */
package com.project.springdemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Rushiraja
 * 
 */
@Component
@Profile("spanish")
public class HelloWorldImplSpanish implements HelloWorldService {

	@Override
	public String getGreetings() {
		
		return "Hollllaaa Mudo !!!!!";
	}

}
