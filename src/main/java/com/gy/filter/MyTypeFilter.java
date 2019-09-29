package com.gy.filter;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyTypeFilter implements TypeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		//metadataReader : 读取到的当前正在扫描的类的信息
		//metadataReaderFactory : 可以获取到其他任何类的信息
		
		//获取当前类注解的信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//System.err.println("当前类注解的信息: " + annotationMetadata);
		//获取当前正在扫描的类的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		String className = classMetadata.getClassName();
		System.err.println("当前类的类名"+className);
		//System.err.println("当前类的类型 : " + classMetadata);
		
		//获取当前类的资源信息
		Resource resource = metadataReader.getResource();
		//System.err.println("资源信息: " + resource);
		//System.err.println("=========================================");
		
		if(className.contains("er")) {
			return true;
		}
		
		return false;
	}

}
