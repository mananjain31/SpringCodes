package com.lifecycle;

public class A 
{
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	
	public void myInit()
	{
		System.out.println("My Init Class A");
	}
	
	public void myDestroy()
	{
		System.out.println("My Destroy Class A");
	}
}
