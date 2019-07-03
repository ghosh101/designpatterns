package com.java.designpattern.decorator;

public class PlainPizza implements Pizza {
	
	PlainPizza(){
		System.out.println("Adding dough");
	}

	@Override
	public String getDescription() {
		return "Thin dough";
	}

	@Override
	public double getCost() {
		return 4.00;
	}

}
