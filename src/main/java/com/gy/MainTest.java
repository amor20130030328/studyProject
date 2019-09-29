package com.gy;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.gy.bean.Book;
import com.gy.bean.Person;
import com.gy.configuration.MyConfiguration;
import com.gy.controller.BookController;
import com.gy.dao.BookDao;
import com.gy.service.BookService;

@Configuration
public class MainTest {
	
	public ApplicationContext app;
	
	@Before
	public void init() {

		app = new AnnotationConfigApplicationContext(MyConfiguration.class);
	}
	
	@Test
	public void test() {
		//根据类名获取
		Person person = app.getBean(Person.class);
		System.err.println(person);
		
		//根据Id获取
		Person person2 = (Person) app.getBean("person");
		System.err.println(person2);
	}
	
	
	@Test
	public void testComponentScan() {
		BookDao bookDao = app.getBean(BookDao.class);

		BookService bookService = (BookService) app.getBean("bookService");
		
		BookController bookController = app.getBean(BookController.class);
		
		Book book = new Book(9, "西游记", "吴承恩", new BigDecimal(56), new Date());
		
		bookController.insert(book);
	}
	
	
	@Test
	public void testBeanDefinition() {
		String[] strings = app.getBeanDefinitionNames();
	
		for (String beanName : strings) {
			System.out.println(beanName);
		}
	}

}
