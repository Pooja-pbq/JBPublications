package com.sn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn.bao.Book;
import com.sn.service.BookService;

@RestController
public class BookController {
	
	 @Autowired
	 private BookService book;
	 
	 @RequestMapping("/getAll")
	 public List<Book> getAllBook()
	 {
		 List<Book> blist=book.getAll();
		 return blist;
	 }
	
}

