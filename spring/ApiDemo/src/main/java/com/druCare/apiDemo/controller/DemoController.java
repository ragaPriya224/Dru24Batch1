package com.druCare.apiDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class DemoController {

	@RequestMapping("name")
	public String getName() {
		return "helloteam";
	}
	
	@RequestMapping("movie")
	public String getMovie() {
		return "movie is about the history of india";
	}
}
