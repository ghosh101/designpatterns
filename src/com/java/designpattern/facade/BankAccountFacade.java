package com.java.designpattern.facade;

public class BankAccountFacade {
	
	private int accountNumber;
	private int securityCode;
	
	private AccountNumberCheck accountNumberChecker;
	private SecurityCodeCheck securityCodeChecker;
	private FundsCheck fundsChecker;
	
	private WelcomeToBank welcomeToBank;
	
	BankAccountFacade(int accountNumber, int securityCode){
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;
		
		welcomeToBank = new WelcomeToBank();
		accountNumberChecker = new AccountNumberCheck();
		securityCodeChecker = new SecurityCodeCheck();
		fundsChecker = new FundsCheck();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void withdrawCash(double cashToGet) {
		if(accountNumberChecker.checkAccountNumberActive(getAccountNumber()) && 
				securityCodeChecker.isCodeCorrect(getSecurityCode()) && 
				fundsChecker.haveEnoughMoney(cashToGet)) {
			
			System.out.println("Transaction Completed");
		}else {
			System.out.println("Transaction Failed");
		}
	}

	public void depositCash(double cashDeposit) {
		if(accountNumberChecker.checkAccountNumberActive(getAccountNumber()) && 
				securityCodeChecker.isCodeCorrect(getSecurityCode())) {
			fundsChecker.makeDeposit(cashDeposit);
			System.out.println("Transaction Completed");
		}else {
			System.out.println("Transaction Failed");
		}
	}
}
