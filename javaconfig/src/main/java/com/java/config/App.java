package com.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext= new AnnotationConfigApplicationContext(HelloWorldConfig.class);
       HelloWorld helloWorld= (HelloWorld) applicationContext.getBean("helloWorld");
       helloWorld.display("Using JavaConfig...");
       
    }
}
