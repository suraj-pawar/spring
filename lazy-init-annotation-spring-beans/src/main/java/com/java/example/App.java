package com.java.example;

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
    	// Look into StudentConfig.class where @Lazy operation is added.
    	// In ApplicationContext by defaults beans is loaded in spring IoC.
    	// To avoid this we add @Lazy annotation on StudentConfig file.
    	// If StudentConfig file contains more than one beans and if want to add
    	// @Lazy annotation on specific bean we can also add above @Bean annotation.
    	ApplicationContext applicationContext= new AnnotationConfigApplicationContext(StudentConfig.class);
    
    	// Due to @Lazy annotation default constructor is not called. 
    	// If we remove the @Lazy annotation then default constructor will call.
    }
}
