package org.bank;

public class BankInfo  {

	public void saving(float accno) {
		
System.out.println("Savings Account of Axis Bank charge :"+accno);
	}
	public void fixed(String balance) {
		
		System.out.println("Fixed Deposit of Axis Bank is: "+balance);
	}
	public void deposit(int amount) {
		
System.out.println("Deposit Amount is minimum : "+amount);
	}
	
public static void main(String[] args) {
	BankInfo a=new BankInfo();
	a.saving(100f);
	a.fixed("6% Percentage");
	a.deposit(150);
}
	}

