package com.pqw.test;

public class HelloWold {

	private String name;
	
	//属性注入
	public void setName(String name) {
		System.out.println("IOC容器赋值");
		this.name = name;
	}
	
	public void hello(){
		System.out.println("hello:"+name);
	}
	//属性注入全类名，反射，需无参构造函数
	public HelloWold() {
		// TODO Auto-generated constructor stub
		System.out.println("构造函数构初始化……");
	}
}
