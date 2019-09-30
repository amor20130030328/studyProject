package com.gy.bean.init_destroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog {
	
	private String prefer;

	public void setPrefer(String prefer) {
		this.prefer = prefer;
	}
	
	public Dog() {
		System.err.println("dog - constructor is runniing...");
	}
	
	@PostConstruct
	public void init() {
		System.err.println("dog - init.....");
	}

	
	@PreDestroy
	public void destroy() {
		System.err.println("dog - destroy.....");
	}
}
