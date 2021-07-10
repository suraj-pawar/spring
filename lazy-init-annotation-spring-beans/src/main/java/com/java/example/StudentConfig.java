package com.java.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy(true)
@Configuration
public class StudentConfig {

	@Bean(name="student")
	public Student getStudent() {
		return new Student();
	}
}
