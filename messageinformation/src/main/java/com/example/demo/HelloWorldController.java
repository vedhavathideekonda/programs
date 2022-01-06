package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {

	//using get method and helloworld URI  
	@GetMapping(path="/helloworld")  
	public String helloWorld()  
	{  
	return "Hello World";  
	}  

	}  

