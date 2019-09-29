package com.gy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ComponentScan.Filter;

import com.gy.bean.Person;

@ComponentScan(basePackages="com.gy",excludeFilters= {
			@Filter(type=FilterType.ANNOTATION,classes= {Controller.class,Service.class})
})
@Configuration
public class MyConfiguration {

	/**
	 * class Ϊ����ֵ����
	 * id Ϊ������
	 * @return
	 */
	@Bean("person")
	public Person getPerson() {
		return new Person("��У", 35);
	}
	
}
