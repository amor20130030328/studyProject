package com.gy.dao;

import com.gy.bean.Book;

public interface BookDao {
	
	/**
	 * 往仓库存入一本书
	 * @param book
	 */
	void save(Book book);

}
