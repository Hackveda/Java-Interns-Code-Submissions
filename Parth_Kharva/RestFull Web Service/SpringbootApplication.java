package com.java.springboot.test.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringbootprojectApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootprojectApplication.class, args);
		
	}

}
