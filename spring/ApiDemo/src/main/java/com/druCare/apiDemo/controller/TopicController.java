package com.druCare.apiDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.druCare.apiDemo.entity.Topic;
import com.druCare.apiDemo.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService service;
	
	
	@GetMapping("/topic")
	public  List<Topic> getAllTopic() {
		return service.getAllTopic();
	}
	
	
	@GetMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return service.getTopic(id);
	}
}
