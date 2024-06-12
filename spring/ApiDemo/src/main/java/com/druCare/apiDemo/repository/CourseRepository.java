package com.druCare.apiDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.druCare.apiDemo.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String>{
	
}
