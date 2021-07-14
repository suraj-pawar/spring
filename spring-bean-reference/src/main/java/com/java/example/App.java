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
       ApplicationContext applicationContext= new ClassPathXmlApplicationContext("SpringConfig.xml");
       Employee employee= (Employee)applicationContext.getBean("employee");
       Department department= (Department) applicationContext.getBean("department");
       
       System.out.println("");
    }
}
