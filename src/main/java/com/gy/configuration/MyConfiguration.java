package com.gy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ComponentScan.Filter;

import com.gy.bean.Person;
import com.gy.dao.BookDao;
import com.gy.filter.MyTypeFilter;

/*@ComponentScan(basePackages="com.gy",excludeFilters= {
			@Filter(type=FilterType.ANNOTATION,classes= {Controller.class,Service.class}),
			@Filter(type=FilterType.ASSIGNABLE_TYPE,classes=BookDao.class)
})*/
/*@ComponentScan(basePackages="com.gy" ,includeFilters= {
		@Filter(type=FilterType.ASSIGNABLE_TYPE,value=BookDao.class)
		
},useDefaultFilters=false)*/

@ComponentScan(basePackages="com.gy",excludeFilters= {
		@Filter(type=FilterType.CUSTOM,value=MyTypeFilter.class)
})
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
