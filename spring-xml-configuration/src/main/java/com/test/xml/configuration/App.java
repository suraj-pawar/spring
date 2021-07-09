package com.test.xml.configuration;

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
    	ApplicationContext applicationContext = 
    			new ClassPathXmlApplicationContext("SpringConfig.xml");
    	
    	Library library= (Library) applicationContext.getBean("library");
    	library.getBook().getBookDeatils();
    }
}
