package com.java.designpattern.strategy;

public class Dog extends Animal {

	public Dog() {
		super();
		setFlyingAbility(new CantFly());
	}
}
