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
	@Column(name="book_id")
	String book_id;
	@Column(name="title")
	String title;
	@Column(name="language")
	String language;
	@Column(name="publication_date")
	Date publication_date;
	@Column(name="author_name")
	String author_name;
	@Column(name="isbn")
	String isbn;
	@Column(name="open_acces")
	boolean open_acces;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String book_id, String title, String language, Date publication_date, String author_name, String isbn,
			boolean open_acces) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.language = language;
		this.publication_date = publication_date;
		this.author_name = author_name;
		this.isbn = isbn;
		this.open_acces = open_acces;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isOpen_acces() {
		return open_acces;
	}

	public void setOpen_acces(boolean open_acces) {
		this.open_acces = open_acces;
	}
	
	
}
