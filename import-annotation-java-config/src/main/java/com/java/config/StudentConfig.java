package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.example.Student;

@Configuration
public class StudentConfig {

	@Bean(name="student")
	public Student getStudent() {
		return new Student();
	}
}
