package com.lifecycle.annotationDemo;
import javax.annotation.*;

public class A {
	private String name;

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void hey() throws Exception
	{
		System.out.println("Hey");
	}

	@PreDestroy
	public void bye() throws Exception
	{
		System.out.println("Bye");
	}
}
