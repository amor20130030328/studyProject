package com.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gy.bean.Book;
import com.gy.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	public void insert(Book book) {
		System.err.println("�������,����Ϊ:" + book.getAuthor());
		bookService.storeBook(book);
	} 
	
	
}


