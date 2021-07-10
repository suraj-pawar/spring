package com.java.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

	@Bean(name="helloWorld")
	public HelloWorld getHelloWorld() {
		return new HelloWorld();
	}
}
