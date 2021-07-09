package com.hello.world;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
    	// Create a resource to read configuration file. 
    	Resource resource= new ClassPathResource("SpringConfig.xml");
    	
    	// Read the beanfactory of the configuration file.
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
    	
    	// Get the HelloWorldBean object
    	HelloWorldBean helloWorldBean= (HelloWorldBean) beanFactory.getBean("helloWorldBean");
    	helloWorldBean.setMessage("Spring Core");
    	helloWorldBean.show();
    }
}
