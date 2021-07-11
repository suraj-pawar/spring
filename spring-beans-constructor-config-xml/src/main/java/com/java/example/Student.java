package com.java.example;

/** A class which contains student related information.
 * 
 * @author suraj
 *
 */
public class Student {

	private Long id;
	private String name;
	private Double percentage;
	
	/**
	 * Default constructor.
	 */
	public Student() {
	
	}

	/** Parameterized constructor.
	 * 
	 * @param id student id
	 * @param name student name
	 * @param percentage student percentage
	 */
	public Student(Long id, String name, Double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
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

	public void getDetails() {
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student percentage: "+percentage);
		
	}
	
	
}
