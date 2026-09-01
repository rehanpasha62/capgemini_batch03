package com.tns.Exception;

public class ArrayIndexDemo {
	public static void main(String[] args) {
	int Marks [] = {80,75,69,34};
	try {
		System.out.println(Marks[2]);
		System.out.println(Marks[5]);
		System.out.println(Marks[1]);
	}
	catch (ArrayIndexOutOfBoundsException r) {
		System.out.println(r);
	}
	System.out.println("Program continue..............");
	}

}
