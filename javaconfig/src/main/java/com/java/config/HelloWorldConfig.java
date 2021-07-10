package com.java.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration annotation indicates that this class defines one or more @Bean method 
// which will be processed by the spring container to generate the Bean definitions and
// service at runtime.
@Configuration
public class HelloWorldConfig {


// @Bean annotation indicates a particular beans definition which will be processed 
// at runtime.
	@Bean(name="helloWorld")
	public HelloWorld getHelloWorld() {
		return new HelloWorld();
	}
}
