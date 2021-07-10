package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.example.Staff;

@Configuration
public class StaffConfig {

	@Bean(name="staff")
	public Staff getStaff() {
		return new Staff();
	}
}
