package com.java.designpattern.facade;

public class AccountNumberCheck {
	private int accountNumber = 56975911;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public boolean checkAccountNumberActive(int accountNumberToCheck) {
		if(accountNumberToCheck == getAccountNumber()) {
			return true;
		}else
			return false;
	}
	
}
