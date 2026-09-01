package com.tns.Exception;

public class ThrowDemo {

	static void CheckAge(int age) {
		if(age<18) {
			throw new ArithmeticException("student is not eligible to vote");
		}
		System.out.println("student is eligible to vote");
		
	}
	public static void main(String[] args) {
		try {
			CheckAge(18);
	}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
}
}
