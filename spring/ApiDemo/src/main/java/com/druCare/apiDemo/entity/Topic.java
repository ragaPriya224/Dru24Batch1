package com.druCare.apiDemo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name ="topicdemo")
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //autogeneration
	private long id;
	
	// long or integer

//	@Enumerated
//	private EmployeeType  type; 
	
	
//	@Column(nullable = false, updatable = false)
	private String name;
	private String contents;
	@Column(name = "age",unique = true,length = 3)
	private int empAge;
	
	
	@Transient // when u don't want something to be saved in db
	private  String debugString;
// useful in javaside, not in db. i don't want that field in db at all 
	
	//private transient String debugString - is not recommended
	
//	@Basic - default operation , 
	public Topic() {

	}


	public Topic(long id, String name, String contents, int empAge) {
		super();
		this.id = id;
		this.name = name;
		this.contents = contents;
		this.empAge = empAge;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
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

	public int getAge() {
		return empAge;
	}

	public void setAge(int age) {
		this.empAge = age;
	}
	
}
