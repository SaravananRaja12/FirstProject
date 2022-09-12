package org.bank;

public class BankInfoArgument  {
	
	public void savings() {
		System.out.println("Savings BankInfoArgument  AC  - 3");
	}
	public void fixed() {
		System.out.println("Fixed BankInfoArgument AC   - 4");
	}
	
	public void deposit() {
		System.out.println("Deposit BankInfoArgument AC  - 2");
		this.savings();
		this.fixed();
	}	
	

}
