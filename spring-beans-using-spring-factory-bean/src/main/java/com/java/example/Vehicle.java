package com.java.example;

/** A class which contains vehicle information.
 * 
 * @author suraj
 *
 */
public class Vehicle {

	private String name;
	private String color;

	/**
	 * Default constructor.
	 */
	public Vehicle() {

	}


	/** Parameterized constructor.
	 * 	
	 * @param name vehicle name
	 * @param color vehicl color
	 */
	public Vehicle(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
