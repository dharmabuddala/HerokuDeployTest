package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemo1 {
	
	@RequestMapping("/heroku")
	public String Demo(){
		return "Hello SpringHeroku";	
		
	}
	
}
