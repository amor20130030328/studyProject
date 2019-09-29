package com.gy.dao;

import org.springframework.stereotype.Repository;

import com.gy.bean.Book;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	@Override
	public void save(Book book) {

	}

}
