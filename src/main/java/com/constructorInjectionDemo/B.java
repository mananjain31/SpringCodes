package com.constructorInjectionDemo;

public class B {
	private String s;
	private A a;
	
	@Override
	public String toString() {
		return "B [\n s=" + s + ", a = \n "+a+"\n]";
	}

	public B(String s, A a) {
		super();
		this.s = s;
		this.a = a;
	}
	
}
