package com.gy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.gy.bean.Black;
import com.gy.bean.Color;
import com.gy.bean.Person;
import com.gy.bean.Red;
import com.gy.conditional.LinuxConditional;
import com.gy.conditional.MyConditional;
import com.gy.conditional.WindowsConditional;


/**
 * 1�� @Import (Ҫ���뵽�����е����) ��
 * �����оͻ��Զ�ע����������idĬ����ȫ����
 */
//@Conditional(LinuxConditional.class)
@Import(value = {Color.class,Red.class,com.gy.selector.MyColorImportSelector.class})
@Configuration
public class MyConfiguration2 {
	
	
	/**
	 * @Scope ������   : singleton : ������Ĭ����������ʱ����ʵ��
	 * 				   prototype : ��ʵ����Ĭ����������ʱ��������������Ӧ��ʵ����ֻ�е����ø÷����ǲŻᴴ����ʵ��
	 * @Lazy  ������    : ��������ʱĬ�ϲ�������������ʱ�ٽ���ʵ������Ȼ������������
	 * @return
	 */
	@Lazy
	@Scope("singleton")
	@Bean(value="person")
	public Person getPerson() {
		System.err.println("�����������Person....");
		return new Person("��ʱ",26);
	}
	
	
	@Conditional(MyConditional.class)
	@Bean("black")
	public Black getBlack() {
		return new Black();
	}
	
	@Conditional(WindowsConditional.class)
	@Bean("bill")
	public Person bill() {
		return new Person("bill gates",67);
	}
	
	@Conditional(LinuxConditional.class)
	@Bean("linus")
	public Person linux() {
		return new Person("linus", 45);
	}

}
