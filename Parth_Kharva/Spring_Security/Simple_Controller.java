package com.spring.security.test.spring_security_test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Simple_Controller {
	@GetMapping("/normal")
	public ResponseEntity<String> normalUser(){
		return ResponseEntity.ok("Yes, I  am normal User");
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser(){
		return ResponseEntity.ok("Yes, I  am admin User");
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser(){
		return ResponseEntity.ok("Yes, I  am pulic User");
	}
}
