package com.java.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("SpringBeanSetterConfig.xml");
    	Student student= (Student) applicationContext.getBean("student");
    	student.getStudentDetails();
    }	
}
