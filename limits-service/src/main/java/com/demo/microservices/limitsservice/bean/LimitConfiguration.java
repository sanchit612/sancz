package com.demo.microservices.limitsservice.bean;

public class LimitConfiguration {
	
	private int maximum;
	private int minimum;
	
	protected LimitConfiguration() {
		
	}
	//we will be using it as a return type of REST service
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}

}
