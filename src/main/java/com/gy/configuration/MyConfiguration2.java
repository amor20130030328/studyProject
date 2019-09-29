package com.gy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.gy.MyColorImportSelector;
import com.gy.bean.Color;
import com.gy.bean.Person;
import com.gy.bean.Red;


/**
 * 1�� @Import (Ҫ���뵽�����е����) ��
 * �����оͻ��Զ�ע����������idĬ����ȫ����
 */
@Import(value = {Color.class,Red.class,MyColorImportSelector.class})
@Configuration
public class MyConfiguration2 {
	
	
	@Scope("prototype")
	@Bean(value="person")
	public Person getPerson() {
		return new Person("��ʱ",26);
	}

}
