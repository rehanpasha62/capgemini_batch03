package com.tns.Inheritancedemo;



class payment{
	void pay(double amount) {
		System.out.println("processing payment:"+amount);
	}
}
class creditcardpayment extends payment{
	void paybycard(){
		System.out.println("payment through creditcard");
	}
}
class upipayment extends payment{
	void paybyupi() {
	System.out.println("payment through upi");
	}
}
public class Maindemo1 {
public static void main(String[] args) {
	upipayment c=new upipayment();
	c.pay(5000);;
	c.paybyupi();
	creditcardpayment c1=new creditcardpayment();
	c.pay(5000);
	c.paybyupi();
}
}