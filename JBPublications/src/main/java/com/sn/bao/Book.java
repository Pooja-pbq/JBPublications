package com.sn.bao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookdetails")
public class Book {
	@Id
	@Column(name="bookId")
	String bookId;
	@Column(name="title")
	String title;
	@Column(name="language")
	String language;
	@Column(name="publicationDate")
	Date publicationDate;
	@Column(name="authorName")
	String authorName;
	@Column(name="isbn")
	String isbn;
	@Column(name="openAcces")
	boolean openAcces;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
