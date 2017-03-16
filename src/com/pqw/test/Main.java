package com.pqw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*
		//创建对象
		HelloWold helloWold=new HelloWold();
		//为name赋值
		helloWold.setName("nwaba");
		
		*/
		//交给spring完后
		//1.创建spring的ioc容器对象
		//application是IOC容器，是接口
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从ioc中取出IOC容器对象,利用id定位到IOC容器中的bean
		HelloWold helloWold=(HelloWold) ctx.getBean("helloWorld");
		//利用类型返回IOC容器中的Bean,但要求IOC容器中的必须只能有一个该类型的bean
//		HelloWold helloWold=ctx.getBean(HelloWold.class);
		//调用方法
		helloWold.hello();
		
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		
		

		car=(Car) ctx.getBean("car2");
		System.out.println(car);
		
		
		Person person =(Person) ctx.getBean("person");
		System.out.println(person);
		
		
	}
}
