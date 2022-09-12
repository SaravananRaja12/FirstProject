package org.bank;

public class BankInfo extends AxisBank{
	private void saving() {
		System.out.println("Saving AC - 6");
	}

	private void fixed() {
		System.out.println("Fixed AC  -3 ");
	}
	public static void main(String[]args) {
		
		BankInfo b= new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
		
		
	}
}
