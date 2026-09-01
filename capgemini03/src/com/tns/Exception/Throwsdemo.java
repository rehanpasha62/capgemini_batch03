package com.tns.Exception;

public class Throwsdemo {
static void calculate(int a, int b)throws ArithmeticException{
	int result=a/b;
	System.out.println("Result: "+result);
}
public static void main(String[] args) {
	try {
		calculate(10,10);
	}
	catch(ArithmeticException e) {
		System.out.println("cannot divide by zero");
	}
}
}
