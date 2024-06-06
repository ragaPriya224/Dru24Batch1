package com.druCare.apiDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.druCare.apiDemo.entity.Topic;

@Service
public class TopicService {
	List<Topic> topicList = new ArrayList(Arrays.asList(
			new Topic("11","fantasy movie","harrypotter"),
			new Topic("33","basic knowledge of java","java dummies"),
			new Topic("22","adv java","sb")
			));
	
	public List<Topic> getAllTopic() {
		return topicList;
	}

	public Topic getTopic(String id) {
	Topic t = new Topic();
		for(int i = 0; i<topicList.size();i++) {
			if(topicList.get(i).getId().equals(id)) {
				return topicList.get(i);
			}
		}
		return t;
	}

	
	public void m1() {
		String[] name = new String[] {"anusha","anuhya","uma","dhruv","meg","venkt"};
		
		
	}

	public void addTopic(Topic t) {
		topicList.add(t);
	}
}
