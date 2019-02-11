package com.project.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rushiraja
 * 
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
	
		return "index";
	}
}
