package com.gy;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gy.bean.init_destroy.Car;
import com.gy.bean.init_destroy.Cat;
import com.gy.bean.init_destroy.Dog;
import com.gy.configuration.LifeCycleConfiguration;

public class MainTest3 {
	
	
	private AnnotationConfigApplicationContext app = null;
	
	@Before
	public void init() {
		app = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
		System.err.println("容器创建成功");
	}
	
	
	@Test
	public void test() {
		
		Car car = app.getBean(Car.class);
		Car car2 = app.getBean(Car.class);
		app.close();
	}
	
	@Test
	public void test2() {
		Cat cat = app.getBean(Cat.class);
		System.err.println(cat);
		app.close();
	}
	
	
	@Test
	public void test3() {
		Dog dog = app.getBean(Dog.class);
		System.err.println(dog);
		app.close();
	}
	
	@Test
	public void test4() {
		
	}
	
	
	

}
