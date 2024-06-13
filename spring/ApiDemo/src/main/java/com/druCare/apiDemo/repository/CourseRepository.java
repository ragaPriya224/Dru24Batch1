package com.druCare.apiDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.druCare.apiDemo.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String>{
	
	
	List<Course> findByTopicId(String topicId);
}
