package com.java.designpattern.strategy;

public class Bird extends Animal {

	public Bird() {
		super();
		setFlyingAbility(new ItFlys());
	}
}
