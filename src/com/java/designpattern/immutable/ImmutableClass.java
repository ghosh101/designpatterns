package com.java.designpattern.immutable;

import java.util.Date;

public final class ImmutableClass {

	private final Integer immutableField1;
	private final String immutableField2;
	private final Date immutableField3;
	
	private ImmutableClass(Integer field1, String field2, Date field3) {
		this.immutableField1 = field1;
		this.immutableField2 = field2;
		this.immutableField3 = field3;
	}
	
	public static ImmutableClass createNewInstance(Integer field1, String field2, Date date) {
		return new ImmutableClass(field1, field2, date);
	}
	
	public Integer getImmutableField1() {
		return immutableField1;
	}

	public String getImmutableField2() {
		return immutableField2;
	}

	public Date getImmutableField3() {
		return new Date(immutableField3.getTime()); //As date class is mutable, we can return a new Date class with content copied into it
	}
	
	@Override
	public String toString() {
		return immutableField1 + " - " + immutableField2 + " - " + immutableField3;
	}
}
