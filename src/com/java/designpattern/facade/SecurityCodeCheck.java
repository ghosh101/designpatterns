package com.java.designpattern.facade;

public class SecurityCodeCheck {
	private int securityCode = 123;
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public boolean isCodeCorrect(int securityCodeToCheck) {
		if(securityCodeToCheck == getSecurityCode()) {
			return true;
		}else
			return false;
	}
}
