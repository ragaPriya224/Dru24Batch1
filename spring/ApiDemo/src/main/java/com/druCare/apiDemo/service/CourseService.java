package com.druCare.apiDemo.service;

import java.util.List;

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
	
//	public List<Course> getAllCourse(String topicId) {
//		
//		List<Course> courseList = new ArrayList<>();
//		courseRepository.findById(null)
//		return topicList;
//	}

//	public Topic getTopic(String id) {
////	Topic t = new Topic();
////		for(int i = 0; i<topicList.size();i++) {
////			if(topicList.get(i).getId().equals(id)) {
////				return topicList.get(i);
////			}
////		}
////		return t;
//
//	return topicRepository.findById(id).get();
//	}
//	
//	public void updateTopic(Topic t) {
//		topicRepository.save(t);
//	}
//
//	public void addTopic(Topic t) {
////		topicList.add(t);
//		topicRepository.save(t);
//	}
//
//	public void deleteTopic(String id) {
////		for(int i = 0; i<topicList.size();i++) {
////			if(topicList.get(i).getId().equals(id)) {
////				topicList.remove(i);
////			}
////		}
////		
//		topicRepository.deleteById(id);
//	}
//
//	public Page<Topic> getTopicByPage(Optional<Integer> pageNo,Optional<String> sortColumn) {
//		// TODO Auto-generated method stub
//		return topicRepository.findAll(PageRequest.of
//				(pageNo.orElse(0),  //page number
//						3,//3 record per page
//						Direction.DESC,
//						sortColumn.orElse("id") // sort by column
//						));
//	}
//
//	public List<Topic> searchTopic(String query) {
//		// TODO Auto-generated method stub
//		return topicRepository.searchTopicDemo(query);
//	}
}
