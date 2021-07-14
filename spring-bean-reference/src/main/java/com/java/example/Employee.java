package com.java.example;

/**
 * 
 * @author suraj
 *
 */
public class Employee {
	
	private Long id;
	private String name;

	/**
	 * default constructor.
	 */
	public Employee() {
	
	}
	
	/**
	 * Parameterize constructor.
	 * 
	 * @param id employee id
	 * @param name employee name
	 */
	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
}
