package com.gy.bean.init_destroy;

public class Car {
	
	
	private String branch;
	
	public Car() {
		System.err.println("����Car....");
	}

	public Car(String branch) {
		super();
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		System.err.println("��Car���ñ�ǩ...");
		this.branch = branch;
	}
	
	
	public void init() {
		System.err.println("Car ��ʼ��...");
	}
	
	public void destroy() {
		System.err.println("Car ����...");
	}
	
}
