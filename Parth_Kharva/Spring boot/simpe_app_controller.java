package com.java.springboot.test.springbootproject;

import org.springframework.web.bind.annotation.RequestMapping;

public class simple_controller {
	@RequestMapping("/hi")
	public String test() {
		return "Spring boot application using spring initiaizer created by Parth Kharva. ";
	}
}
