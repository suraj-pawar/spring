package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.java.spring.BookDetails;

/** A class which contains {@link BookDetails} configuration. 
 * 
 * @author suraj
 *
 */

@Configuration
public class BookDetailsConfig {

	// BookDetails bean scope is singleton.
	@Bean(name="bookDetails")
	@Scope("singleton")
	public BookDetails getBookDetails() {
		return new BookDetails();
	}
}
