package com.java.designpattern.decorator;

public class Mozarella extends ToppingDecorator {

	Mozarella(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Mozarella");
	}
	
	public String getDescription() {
		return pizza.getDescription() + ", Mozarella";
	}

	public double getCost() {
		return pizza.getCost() + 0.50;
	}

}
