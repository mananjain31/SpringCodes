package com.beansDemo;
import org.springframework.context.support.*;
import org.springframework.context.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("com/beansDemo/MyConfig.xml");
    	System.out.println("Now calling 'getBean' methods");
    	A a = (A) ac.getBean("Abean1");
    	System.out.println(a);
    	B b = (B) ac.getBean("Bbean1");
    	System.out.println(b);
    	System.out.println("Changing value of x of a and then displaying a and b");
    	a.setX(900000);
    	System.out.println(a);
    	System.out.println(b);
    }
} 
