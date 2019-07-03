package com.java.designpattern.immutable;

import java.util.Date;

public class TestClass {

	public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createNewInstance(100, "test1", new Date());
		System.out.println(im);		
		modification(im.getImmutableField1(), im.getImmutableField2(), im.getImmutableField3());
		System.out.println(im);
	}
	
	private static void modification(int a2, String s2, Date date){
        a2 = 20;
        s2 = "changed";
        date = new Date();
    }

}
