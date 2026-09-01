package com.tns.Exception;

public class Throwdemo2 {
static void checkpassword(String Password) {
	if(Password.length()<6) {
		throw new IllegalArgumentException("password is short");
	}
	System.out.println("Password Accepted");
	
}
public static void main(String[] args) {
	try {
		checkpassword("abcde");
	}
	catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}
}
