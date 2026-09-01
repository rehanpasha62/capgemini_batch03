package com.tns.Exception;

public class FinallyDemo {
public static void main(String[] args) {
	try {
		System.out.println(5/0);
	}
	catch(ArrayIndexOutOfBoundsException f) {
		System.out.println(f);
	}
	finally {
		System.out.println("Welcome to java");
		
	}
}
}
