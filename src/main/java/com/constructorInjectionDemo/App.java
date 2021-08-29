package com.constructorInjectionDemo;
import org.springframework.context.support.*;
import org.springframework.context.*;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac; 
		ac = new ClassPathXmlApplicationContext("com/constructorInjectionDemo/MyConfig.xml");
		A a = (A)ac.getBean("abean");
		System.out.println(a);	
		System.out.println("*******************************");	
		B b = (B)ac.getBean("bbean");
		System.out.println(b);
	}

}
