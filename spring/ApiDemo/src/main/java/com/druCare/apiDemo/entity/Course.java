package com.druCare.apiDemo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course{

	@Id
	private String id;
	
	private String name;
	@Column(name = "course_type")
	private String courseType;
	
	
	// many courses for a single topic 
	@ManyToOne()
	public Topic topic;

	public Course() {
	}
	
	public Course(String id, String name, String courseType,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.courseType = courseType;
		this.topic = new Topic(topicId,"","");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
}
