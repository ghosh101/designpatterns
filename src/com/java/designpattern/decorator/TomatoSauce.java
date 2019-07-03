package com.java.designpattern.decorator;

public class TomatoSauce extends ToppingDecorator {

	TomatoSauce(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Tomato Sauce");
	}
	
	public String getDescription() {
		return pizza.getDescription() + ", Tomato Sauce";
	}

	public double getCost() {
		return pizza.getCost() + 0.30;
	}

}

