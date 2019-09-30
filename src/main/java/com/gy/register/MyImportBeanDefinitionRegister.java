package com.gy.register;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.gy.bean.Rainbow;

public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		
		boolean isYellow = registry.containsBeanDefinition("com.gy.bean.Yellow");
		
		if(isYellow) {
			System.out.println("º¬ÓÐ»ÆÉ«");
		}
		
		BeanDefinition beanDefinition = new RootBeanDefinition(Rainbow.class);
		registry.registerBeanDefinition("rainbow", beanDefinition);
	}

}
