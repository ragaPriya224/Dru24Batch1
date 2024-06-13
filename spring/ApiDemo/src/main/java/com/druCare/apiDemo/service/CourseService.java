package com.druCare.apiDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.druCare.apiDemo.entity.Course;
import com.druCare.apiDemo.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;

	// add a course to a particular topic 
	public void addCourse(Course c) {
		// TODO Auto-generated method stub
		courseRepository.save(c);
	}

	//update an existing course
	public void updateCourse(Course course, String courseId) {
		courseRepository.save(course);
	}

	public Optional<Course> getCourse(String courseId) {
		return courseRepository.findById(courseId);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

	//get all the course  belongs to a particular topic id
	public List<Course> getAllCourse(String topicId) {
		List<Course> courseList = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courseList::add);
		return courseList;
	}

}
