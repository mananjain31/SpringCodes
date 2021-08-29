package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class B implements InitializingBean, DisposableBean {
	private String price;

	@Override
	public String toString() {
		return "B [price=" + price + "]";
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Init for B (Bean life cycle methods using interface)");
	}
	public void destroy() throws Exception
	{
		System.out.println("Destroy for B (Bean life cycle methods using interface)");
	}
}
