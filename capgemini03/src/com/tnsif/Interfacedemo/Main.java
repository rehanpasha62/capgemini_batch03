package com.tnsif.Interfacedemo;



interface Payment{
	void pay(double amount);
	void checkStatus();
}

class UPI implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("paid"+amount+"Using UPI");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("upi payments successfull ");
		
	}
	
}
public class Main {
public static void main(String[] args) {
	UPI u = new UPI();
	u.pay(500);
	u.checkStatus();
}
}
