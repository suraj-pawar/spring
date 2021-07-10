package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.config.BookDetailsConfig;
import com.java.config.StudentDetailsConfig;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext bookDetailsApplicationContext= new AnnotationConfigApplicationContext(BookDetailsConfig.class);
		BookDetails javaBookDetails= (BookDetails) bookDetailsApplicationContext.getBean("bookDetails");
		javaBookDetails.setName("Java");
		javaBookDetails.setEdition("9th edition");
		javaBookDetails.printBookDetails();

		BookDetails pythonBookDetails = (BookDetails) bookDetailsApplicationContext.getBean("bookDetails");
		pythonBookDetails.printBookDetails();
		
		// Output
		
		// Book name: Java
		// Book edition: 9th edition
		
		// Due to BookDetails class is bind in singleton scope (BookDetailsConfig.class)
		// pythonBookDetails object getting the same value of javaBookDetails object.
		
		// Book name: Java
		// Book edition: 9th edition
		
		
		ApplicationContext studentApplicationContext = new AnnotationConfigApplicationContext(StudentDetailsConfig.class);
		Student schoolStudent= (Student) studentApplicationContext.getBean("student");
		schoolStudent.setId(1);
		schoolStudent.setName("Suraj");
		schoolStudent.displayStudentInfo();
		
		
		Student collegeStudent= (Student) studentApplicationContext.getBean("student");
		collegeStudent.displayStudentInfo();
		
		// Output
		
		// Student id: 1
		// Student name: Suraj
		
		// Due to Student class is bind in prototype scope, (StudentDetailsConfig.class)
		// collegeStudent object getting new instance in spring IoC container everytime. 
		// Student id: 0
		// Student name: null
	

	}
}
