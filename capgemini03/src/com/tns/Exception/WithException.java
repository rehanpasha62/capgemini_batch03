package com.tns.Exception;

public class WithException {
public static void main(String[] args) {
	
	System.out.println("Good Morrning all");
	int a=90;
	int b=0;
	System.out.println("Welcome to java");
	try {
		System.out.println(a/b);
	}
	catch(Exception r) {
		System.out.println(r);
	}
	System.out.println("Hello World!!");
}
}
