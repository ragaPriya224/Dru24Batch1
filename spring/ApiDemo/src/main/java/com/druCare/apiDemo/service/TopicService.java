package com.druCare.apiDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.druCare.apiDemo.entity.Topic;
import com.druCare.apiDemo.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	public List<Topic> getAllTopic() {
//		return topicList;
		List<Topic> topicList = new ArrayList<>();
		
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}

	public Topic getTopic(String id) {
//	Topic t = new Topic();
//		for(int i = 0; i<topicList.size();i++) {
//			if(topicList.get(i).getId().equals(id)) {
//				return topicList.get(i);
//			}
//		}
//		return t;

	return topicRepository.findById(id).get();
	}
	
	public void updateTopic(Topic t) {
		topicRepository.save(t);
	}

	public void addTopic(Topic t) {
//		topicList.add(t);
		topicRepository.save(t);
	}

	public void deleteTopic(String id) {
//		for(int i = 0; i<topicList.size();i++) {
//			if(topicList.get(i).getId().equals(id)) {
//				topicList.remove(i);
//			}
//		}
//		
		topicRepository.deleteById(id);
	}
}
