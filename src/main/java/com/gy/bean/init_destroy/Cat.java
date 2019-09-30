package com.gy.bean.init_destroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean ,DisposableBean{

	private String furColor;
	
	public Cat() {
		
		System.out.println( "car's  constructor...");
	}
	
	public void setFurColor(String furColor) {
		System.out.println("car's setting...");
		this.furColor = furColor;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initialing...");
	}

}
