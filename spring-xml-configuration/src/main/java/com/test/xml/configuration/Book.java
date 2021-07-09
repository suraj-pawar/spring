package com.test.xml.configuration;

/** A class which contains book meta-data.
 * 
 * @author suraj
 *
 */
public class Book {

	private String title;
	private String publication;
	private String author;

	public Book() {

	}

	public Book(String title, String publication, String author) {
		super();
		this.title = title;
		this.publication = publication;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void getBookDeatils() {
		System.out.println("Published book details....");
		System.out.println("Booke title: "+title);
		System.out.println("Book publication: "+publication);
		System.out.println("Book author: "+author);
	}

}
