package com.java.designpattern.adapter;

public class School {

	public static void main(String[] args) {
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am tired to write the assignment");
	}

}
