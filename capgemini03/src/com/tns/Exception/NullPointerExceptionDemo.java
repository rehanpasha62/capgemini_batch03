package com.tns.Exception;

public class NullPointerExceptionDemo {
public static void main(String[] args) {
	String str=null;
	try {
		System.out.println(str.length());
	}
	catch(NullPointerException n){
		System.out.println(n);
	}
	System.out.println("Program continue......");
}
		
}
