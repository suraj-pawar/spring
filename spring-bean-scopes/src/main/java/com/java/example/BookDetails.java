package com.java.example;

/** A class which contains book details.
 * 
 * @author suraj
 *
 */
public class BookDetails {

	private String name;
	private String author;
	private String edition;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}

	/**
	 * It displays the book details.
	 */
	public void getBookDetails() {
		System.out.println("Book name: "+name);
		System.out.println("Book author: "+author);
		System.out.println("Book edition: "+edition);
	}

}
