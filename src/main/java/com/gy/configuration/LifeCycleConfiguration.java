package com.gy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gy.bean.init_destroy.Car;
import com.gy.bean.init_destroy.Cat;
import com.gy.bean.init_destroy.Dog;


@ComponentScan(basePackages="com.gy.beanpostProcessor")
@Configuration
public class LifeCycleConfiguration {
	
	
	@Scope("singleton")
	@Bean(value="car",initMethod="init",destroyMethod="destroy")
	public Car getCar() {
		Car car = new Car();
		car.setBranch("BMW");
		return car;
	}
	
	@Bean
	public Cat cat() {
		Cat cat = new Cat();
		cat.setFurColor("yellow");
		return cat;
	}
	
	
	@Bean("dog")
	public Dog dog() {
		
		Dog dog = new Dog();
		dog.setPrefer("¹ÇÍ·");
		return dog;
		
	}

}
