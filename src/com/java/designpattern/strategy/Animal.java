package com.java.designpattern.strategy;

public class Animal {

	public Flys flys;
	
	public String tryToFly() {
		return flys.fly();
	}

	public void setFlyingAbility(Flys flys) {
		this.flys = flys;
	}
}
