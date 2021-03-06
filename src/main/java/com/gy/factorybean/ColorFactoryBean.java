package com.gy.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.gy.bean.Color;

public class ColorFactoryBean implements FactoryBean<Color>{

	@Override
	public Color getObject() throws Exception {
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		return Color.class;
	}
	
	@Override
	public boolean isSingleton() {
		
		return false;
	}

}
