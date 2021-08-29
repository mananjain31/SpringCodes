package com.beansDemo;

import java.util.List;

public class A {
	private int x;
	private String y;
	private List<Double> z;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("destroyed A");
	}
	public A() {
		super();
		System.out.println("class a constructor");
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public List<Double> getZ() {
		return z;
	}
	public void setZ(List<Double> z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
