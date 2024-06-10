package com.druCare.apiDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic t ) {
		service.addTopic(t);
	}
	
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		 service.deleteTopic(id);
	}
	
	@PutMapping("topic/{id}")
	public void updateTopic(@RequestBody Topic t ) {
		service.updateTopic(t);
	}
	@GetMapping("/topic/page")
	public  Page<Topic> getTopicByPage(@RequestParam("pageNo") Optional<Integer> pageNo,
			@RequestParam("sort") Optional<String> sortBy) {
		return service.getTopicByPage(pageNo,sortBy);
	}
	
	
	
	
}
