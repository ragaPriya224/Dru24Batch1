package com.druCare.apiDemo.entity;

public class Topic {

	
	private String id;
	private String contents;
	private String name;
	
	public Topic() {
		
	}
	public Topic(String id, String contents, String name) {
		super();
		this.id = id;
		this.contents = contents;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
