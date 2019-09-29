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
		//metadataReader : ��ȡ���ĵ�ǰ����ɨ��������Ϣ
		//metadataReaderFactory : ���Ի�ȡ�������κ������Ϣ
		
		//��ȡ��ǰ��ע�����Ϣ
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//System.err.println("��ǰ��ע�����Ϣ: " + annotationMetadata);
		//��ȡ��ǰ����ɨ����������Ϣ
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		String className = classMetadata.getClassName();
		System.err.println("��ǰ�������"+className);
		//System.err.println("��ǰ������� : " + classMetadata);
		
		//��ȡ��ǰ�����Դ��Ϣ
		Resource resource = metadataReader.getResource();
		//System.err.println("��Դ��Ϣ: " + resource);
		//System.err.println("=========================================");
		
		if(className.contains("er")) {
			return true;
		}
		
		return false;
	}

}
