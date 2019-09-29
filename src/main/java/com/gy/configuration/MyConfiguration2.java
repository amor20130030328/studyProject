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
 * 1） @Import (要导入到容器中的组件) ，
 * 容器中就会自动注册这个组件，id默认是全类名
 */
//@Conditional(LinuxConditional.class)
@Import(value = {Color.class,Red.class,com.gy.selector.MyColorImportSelector.class})
@Configuration
public class MyConfiguration2 {
	
	
	/**
	 * @Scope 作用域   : singleton : 单例，默认容器启用时创建实例
	 * 				   prototype : 多实例，默认容器创建时不会立即创建对应的实例，只有当调用该方法是才会创建该实例
	 * @Lazy  懒加载    : 容器启动时默认不创建，到调用时再进行实例化，然后保留在容器中
	 * @return
	 */
	@Lazy
	@Scope("singleton")
	@Bean(value="person")
	public Person getPerson() {
		System.err.println("给容器中添加Person....");
		return new Person("李时",26);
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
