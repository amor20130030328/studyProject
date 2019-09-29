package com.gy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.bean.Book;
import com.gy.dao.BookDao;


@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Override
	public void storeBook(Book book) {
		System.err.println("新书入库,书名为: " + book.getTitle());
		
		bookDao.save(book);
	}

}
