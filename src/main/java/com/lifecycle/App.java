package com.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//1
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/MyConfig.xml");
//		A a = (A) context.getBean("Abean");
//		System.out.println(a);
		

		//2
		//https://stackoverflow.com/questions/42018044/what-is-the-difference-between-registershutdownhook-and-close
		/*
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/MyConfig.xml");
		context.registerShutdownHook();
		A a = (A) context.getBean("Abean");
		System.out.println(a);
		*/
		
		//3
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/MyConfig.xml");
//		context.registerShutdownHook();
//		context.close();
//		context.refresh();
//		A a = (A) context.getBean("Abean");
//		System.out.println(a);

		//4
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/MyConfig.xml");
//		context.registerShutdownHook();
//		B b = (B)context.getBean("Bbean");
//		System.out.println(b);
		//Note : 
		/*
		 * init and destroy methods will be called in order of declarations of the beans in the xml file
		 * first bean declared => first iunit to be callled from it 
		 * last bean declared => first destroy to be callled from it
		 */
		

		//5
		
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/MyConfig.xml");
//		context.registerShutdownHook();
//		A a = (A)context.getBean("Abean");
//		System.out.println(a);
//		System.out.println("*******************");
//		B b = (B)context.getBean("Bbean");
//		System.out.println(b);
		
		//Note : 
		/*
		 * init and destroy methods will be called in order of declarations of the beans in the xml file
		 * first bean declared => first iunit to be callled from it 
		 * last bean declared => first destroy to be callled from it
		 */
		
	}
}