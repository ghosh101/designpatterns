package com.java.designpattern.strategy;

/*
 * Define a family of algorithms. Encapsulate each one with an interface, and make them interchangeable.
 * The strategy design pattern lets the algorithm vary independently from clients that use it.
 */
public interface Flys {
	String fly();
}


class ItFlys implements Flys{

	@Override
	public String fly() {
		return "Flying High";
	}
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		return "Can't Fly";
	}
	
}