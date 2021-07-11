package com.java.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	
    	// Beans properties are configure through Spring constructor injection by declaring the 
    	// <constructor-tag> tag.
    	// In constructor Injection name attribute is not required as the constructor arguments 
    	// are position based. 
    	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("StudentBeanConstructorConfig.xml");
    	Student student= (Student)applicationContext.getBean("student");
    	student.getDetails();
    }
}
