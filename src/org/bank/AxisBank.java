package org.bank;
//OverRide in AxisBank with Deposit Method
public class AxisBank extends BankInfo {

	
	public void deposit(int Amount) {
		
System.out.println("AxisBank Deposit Amount is :"+Amount);
super.deposit(134);
	}
	
	
	public static void main(String[] args) {
		
		AxisBank a=new AxisBank();
		a.deposit(250);
	}

	private void bank() {
		// TODO Auto-generated method stub

	}

	public void transfer() {
		System.out.println("Money transfer to push");
		
		System.out.println("fisrt dev conflict");
	}
	
}
