package org.bank;

public class AxisBankArgument  extends BankInfoArgument{
	
	public void deposit() {
		System.out.println("Deposit AxisBankArgument AC  - 2");
		super.deposit();
	}	
	public static void main(String[]args){
		AxisBankArgument a=new AxisBankArgument();
		a.deposit();
	}

}
