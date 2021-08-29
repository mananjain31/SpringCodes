package com.constructorInjectionDemo;
import java.util.List;

public class A {
	private String x; 
	private int y; 
	private List<Boolean> z;
	
	public A(String x, int y, List<Boolean> z) {
		super();
		this.x = x;
		this.y = y;
		this.z= z;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + ", z="+z+" ]";
	}

}
