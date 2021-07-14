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
    	// Look into SpringCOnfig.xml where how configure Car and Bike beans.
       ApplicationContext applicationContext= new ClassPathXmlApplicationContext("SpringConfig.xml");
       
       Car car= (Car) applicationContext.getBean("car");
       System.out.println(car.getName());
       System.out.println(car.getColor());
       System.out.println(car.getTyres());
       
       Bike bike= (Bike) applicationContext.getBean("bike");
       System.out.println(bike.getName());
       System.out.println(bike.getColor());
       System.out.println(bike.getTyres());
    }
}
