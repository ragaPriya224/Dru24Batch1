package com.druCare.apiDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.druCare.apiDemo.entity.Course;
import com.druCare.apiDemo.entity.Topic;
import com.druCare.apiDemo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService service;
	
	
//	@GetMapping("/topic/{id}/course")
//	public  List<Course> getAllCourse(@PathVariable String id) {
//		return service.getAllCourse(id);
//	}
	
//	
//	@GetMapping("/topic/{id}")
//	public Course getCourse(@PathVariable String id) {
//		return service.getCourse(id);
//	}
//	
	@PostMapping("/topic/{id}/course")
	public void addCourse(@RequestBody Course c, @PathVariable String id  ) {
		c.setTopic(new Topic(id,"",""));
		service.addCourse(c);
	}
//	
//	@DeleteMapping("/topic/{id}")
//	public void deleteTopic(@PathVariable String id) {
//		 service.deleteTopic(id);
//	}
//	
//	@PutMapping("topic/{id}")
//	public void updateTopic(@RequestBody Topic t ) {
//		service.updateTopic(t);
//	}
//	@GetMapping("/topic/page")
//	public  Page<Topic> getTopicByPage(@RequestParam("pageNo") Optional<Integer> pageNo,
//			@RequestParam("sort") Optional<String> sortBy) {
//		return service.getTopicByPage(pageNo,sortBy);
//	}
//	
//	@GetMapping("/topic/search")
//	public List<Topic> searchTopic(@RequestParam("query") String query){
//		return service.searchTopic(query);
//
//	}
	
	
}
