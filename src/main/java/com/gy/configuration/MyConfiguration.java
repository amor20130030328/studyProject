package com.gy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gy.bean.Person;

@ComponentScan(basePackages="com.gy")
@Configuration
public class MyConfiguration {

	/**
	 * class 为返回值类型
	 * id 为方法名
	 * @return
	 */
	@Bean("person")
	public Person getPerson() {
		return new Person("少校", 35);
	}
	
}
