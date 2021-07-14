package com.java.example;

/** A class contains Bike related information.
 *  
 * @author suraj
 *
 */
public class Bike extends Vehicle{
	
	private int tyres;
	
	/**
	 * Default constructor.
	 */
	public Bike() {
	
	}
	
	/** Parameterized constructor.
	 * 
	 * @param name bike name 
	 * @param color bike color
	 */
	public Bike(String name,String color) {
		super(name,color);
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	
	

}
