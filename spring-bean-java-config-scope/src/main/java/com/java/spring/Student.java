package com.java.spring;

/** A class which conatins student related information.
 * 
 * @author suraj
 *
 */
public class Student {
	
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * It displays the student information.
	 */
	public void displayStudentInfo() {
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
	}
	
	
}
