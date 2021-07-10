package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.java.spring.Student;

@Configuration
public class StudentDetailsConfig {

	// Student bean scope is prototype.
	@Bean(name="student")
	@Scope("prototype")
	public Student getStudent() {
		return new Student();
	}
}
