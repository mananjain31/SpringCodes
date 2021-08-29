package com.beansDemo;

public class B {
	private String name;
	private A a;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("destroyed B");
	}
	public B() {
		super();
		System.out.println("class B constructor");	
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [name=" + name + ", a=" + a + "]";
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
}
