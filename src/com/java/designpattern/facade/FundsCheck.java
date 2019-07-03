package com.java.designpattern.facade;

public class FundsCheck {

	private double cashInAccount = 1000.00;
	
	private double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount = cashInAccount - cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount = cashInAccount + cashDeposited;
	}
	
	public boolean haveEnoughMoney(double cashWithdrawal) {
		if(cashWithdrawal > cashInAccount) {
			System.out.println("Error: you do not have enough money");
			System.out.println("Current Balance: " + getCashInAccount());
			
			return false;
		}else {
			decreaseCashInAccount(cashWithdrawal);
			System.out.println("Withdrwal complete: Current Balance is " + getCashInAccount());
			
			return true;
		}
	}
	
	public void makeDeposit(double cashDeposit) {
		increaseCashInAccount(cashDeposit);
		
		System.out.println("Desposit Complete: Current Balance is " + getCashInAccount());
	}
}
