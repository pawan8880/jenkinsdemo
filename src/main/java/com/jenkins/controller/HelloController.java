package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String msg() {
		return "Hello MOTO This Is Jenkins World";
		
	}
	
	
	@GetMapping("/hii")
	public String msgforJenkinsTest() {
		return "Hello!  This Is Jenkins World mr pawan";
		
	}
}
