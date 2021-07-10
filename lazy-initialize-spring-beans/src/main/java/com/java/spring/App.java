package com.java.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		// The BeanFactory by default lazy loads the beans, it creates the bean only when 
		// the getBean() method is called.
		
		// Resource resource= new ClassPathResource("SpringBeanConfig.xml");
		// BeanFactory beanFactory= new XmlBeanFactory(resource);

		// The ApplicationContext loads all the beans which are in singleton scope 
		// without calling getBean() method.
		// By default bean scope is singleton scope.
		// If we change the scope to prototype or any other the beans are loaded by default.
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		// output 
		// Here whenever ApplicationContext loaded the Bean1 class constructor is called. 
		// To this situation in order to lazy initialize the bean loading we will use 
		// "lazy-init" attribute set to true. (See into SpringBeanConfig.xml file)
		// So that bean is loaded only when it called. 

	}
}
