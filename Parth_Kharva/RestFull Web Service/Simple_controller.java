package com.java.springboot.test.springbootproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class simple_controller{
	
	@RequestMapping("/hello")
	public webservice test(){
		return new webservice("Parth Kharva","Navrachana University","BCA","JAVA Intern At Hackveda");
	}
}
