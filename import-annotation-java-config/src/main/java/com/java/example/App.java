package com.java.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
       
       Staff staff= (Staff) applicationContext.getBean("staff");
       staff.displayStaff();
       
       Student student= (Student) applicationContext.getBean("student");
       student.displayStudent();
    }
}
