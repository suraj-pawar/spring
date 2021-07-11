package com.java.example;

/** A class which contains student details.
 * 
 * @author suraj
 *
 */
public class Student {

	private Long id;
	private String name;
	private Double percentage;

	/**
	 * default constructor.
	 */
	public Student() {
	
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public void getStudentDetails() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Percentage: "+percentage);
	}

}
