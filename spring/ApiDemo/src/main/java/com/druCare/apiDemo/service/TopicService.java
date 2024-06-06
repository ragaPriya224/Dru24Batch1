package com.druCare.apiDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.druCare.apiDemo.entity.Topic;

@Service
public class TopicService {

	public List<Topic> getAllTopic() {
		List<Topic> topicList = new ArrayList(Arrays.asList(
				new Topic("11","fantasy movie","harrypotter"),
				new Topic("33","basic knowledge of java","java dummies"),
				new Topic("22","adv java","sb")
				));
		return topicList;
	}

}
