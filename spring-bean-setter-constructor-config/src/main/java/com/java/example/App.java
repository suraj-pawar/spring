package com.java.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("StudentConfig.xml");

		// Here while create student bean instance parmeterized constructor is invoked and values are set.
		// But in StudentConfig.xml file we use setter injection for Id property so after initializing the 
		// student instance the due to property tag it's overrides the student id value. 
		Student student=(Student)applicationContext.getBean("student");
		student.getDetails();

		// output
		// Id: 10
		// Name: "Suraj"
		// Percentage: 80.0


	}
}
