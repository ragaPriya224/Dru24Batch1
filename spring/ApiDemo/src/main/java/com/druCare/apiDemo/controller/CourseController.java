package com.druCare.apiDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.druCare.apiDemo.entity.Course;
import com.druCare.apiDemo.entity.Topic;
import com.druCare.apiDemo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	
	@GetMapping("/topic/{id}/course")
	public  List<Course> getAllCourse(@PathVariable String id) {
		return courseService.getAllCourse(id);
	}
	
	@GetMapping("/topic/{id}/course/{courseId}")
	public Optional<Course> getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}
	
	@PostMapping("/topic/{id}/course")
	public void addCourse(@RequestBody Course course,@PathVariable String id) {
		course.setTopic(new Topic(id,"",""));
		courseService.addCourse(course);
	}
	
	@DeleteMapping("/topic/{topicId}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	
	@PutMapping("topic/{id}/course/{courseId}")
	public void updateCourse(@RequestBody Course course,@PathVariable String courseId ) {
		courseService.updateCourse(course,courseId);
	}
	
}
