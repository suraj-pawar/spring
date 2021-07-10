package com.java.spring;

/** A class which contains Book details.
 * 
 * @author suraj
 *
 */
public class BookDetails {

	private String name;
	private String edition;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}

	public void printBookDetails() {
		System.out.println("Book name: "+name);
		System.out.println("Book edition: "+edition);
	}

}
