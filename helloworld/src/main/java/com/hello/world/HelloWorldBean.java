package com.hello.world;

/**
 *  A simple class for message printing.
 * 
 * @author suraj
 *
 */
public class HelloWorldBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * It shows the message.
	 */
	public void show() {
		System.out.println("Welcome "+message );
	}
	
}
