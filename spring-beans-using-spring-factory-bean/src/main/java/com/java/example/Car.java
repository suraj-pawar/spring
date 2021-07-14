package com.java.example;

/** A class which contains Car related information.
 * 
 * @author user1
 *
 */
public class Car extends Vehicle{
	
	private int tyres;
	
	/**
	 * Default constructor.
	 */
	public Car() {
	
	}
	
	public Car(String name,String color) {
		super(name,color);
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	
}
