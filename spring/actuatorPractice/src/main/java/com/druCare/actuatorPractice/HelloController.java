package com.druCare.actuatorPractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
}
