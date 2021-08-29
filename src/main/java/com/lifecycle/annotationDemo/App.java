package com.lifecycle.annotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/annotationDemo/MyConfig.xml");
		context.registerShutdownHook();
		A a = (A) context.getBean("Abean");
		System.out.println(a);
		
	}
}