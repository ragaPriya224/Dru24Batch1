package com.questGlobal.aopDemo;

public class Student {
	//2 fields
	private Integer age;
	private String name;
	//getter & setter
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		System.out.println("Age : " + age );
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		System.out.println("Name : " + name );
		return name;
	}
	//method to throw exception
	public void printThrowException(){
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}
