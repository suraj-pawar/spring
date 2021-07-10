package com.java.example;

import java.io.ObjectOutputStream.PutField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext singletonApplicationContext= new ClassPathXmlApplicationContext("SingletonScopeSpringConfig.xml");
		BookDetails cBookDeatils= (BookDetails) singletonApplicationContext.getBean("bookDetails");

		cBookDeatils.setName("programming language in C");
		cBookDeatils.setAuthor("Dennis Ritchie");
		cBookDeatils.setEdition("3rd edition");
		cBookDeatils.getBookDetails();

		BookDetails javaBookDeatils= (BookDetails) singletonApplicationContext.getBean("bookDetails");
		javaBookDeatils.getBookDetails();

		// Due to BookDeatils class is bind in singleton scope (SingletonScopeSpringConfig.xml), 
		// in spring IoC container getting same value for javaBookDeatils object. 

		//      Output
		//		Book name: programming language in C
		//		Book author: Dennis Ritchie
		//		Book edition: 3rd edition
		
		// 		javaBookDeatils object prints
		//		Book name: programming language in C    <------ same O/p (due to Singletone scope)
		//		Book author: Dennis Ritchie				<------ same O/p (due to Singletone scope)
		//		Book edition: 3rd edition				<------ same O/p (due to Singletone scope)


		ApplicationContext prototypeApplicationContext = new ClassPathXmlApplicationContext("PrototypeScopeSpringConfig.xml");
		BookDetails pythonBookDetails = (BookDetails) prototypeApplicationContext.getBean("bookDetails");
		pythonBookDetails.setName("Python");
		pythonBookDetails.setEdition("4th edition");
		pythonBookDetails.setAuthor("Guido van rossum");
		pythonBookDetails.getBookDetails();

		BookDetails javaBookDetails = (BookDetails) prototypeApplicationContext.getBean("bookDetails");
		javaBookDetails.getBookDetails();

		// Due to BookDetails class is bind in prototype scope("PrototypeScopeSpringConfig.xml"),
		// in spring IoC container whenever you create instance of BookDetails class 
		// it will create a new instance.
		
		//  Output
		//	Book name: Python
		//	Book author: Guido van rossum
		//	Book edition: 4th edition
		
		//  javaBookDeatils object prints
		//	Book name: null     <------  null (because value not set to javaBookDetails object)
		//	Book author: null	<------	 null (because value not set to javaBookDetails object)
		//	Book edition: null	<------  null (because value not set to javaBookDetails object) 

	}
}
