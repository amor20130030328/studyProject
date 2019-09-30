package com.gy.bean.init_destroy;

public class Car {
	
	
	private String branch;
	
	public Car() {
		System.err.println("创建Car....");
	}

	public Car(String branch) {
		super();
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		System.err.println("给Car设置标签...");
		this.branch = branch;
	}
	
	
	public void init() {
		System.err.println("Car 初始化...");
	}
	
	public void destroy() {
		System.err.println("Car 回收...");
	}
	
}
