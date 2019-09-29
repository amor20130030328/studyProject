package com.gy;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.gy.bean.Black;
import com.gy.bean.Person;
import com.gy.bean.Yellow;
import com.gy.configuration.MyConfiguration2;

public class MainTest2 {
	
	
	private ApplicationContext app;
	
	@Before
	public void init() {
		app = new AnnotationConfigApplicationContext(MyConfiguration2.class);
	}
	
	
	@Test
	public void test() {
		
//		Person person = (Person) app.getBean("person");
//		Person person2 = (Person) app.getBean("person");
//		System.err.println(person == person2);
	}
	
	
	public  void printBeanDefinition(ApplicationContext app) {
		
		String[] names = app.getBeanDefinitionNames();
		for (String name : names) {
			System.err.println(name);
		}
	}

	@Test
	public void testImport() {
		printBeanDefinition(app);
	}
	
	
	@Test
	public void testGetYellow() {
		Yellow yellow = app.getBean(Yellow.class);
		System.err.println(yellow);
	}
	
	@Test
	public void testConditional() {
	
		Environment environment = app.getEnvironment();
		String osName = environment.getProperty("os.name");
		System.err.println("操作系统名称:" + osName);
		
		getNamesByType(Person.class);
	
	}
	
	
	public void getNamesByType(Class clazz) {
		String[] names = app.getBeanNamesForType(clazz);
		for (String name : names) {
			System.err.println(name);
		}
	}
	
	
	
}
