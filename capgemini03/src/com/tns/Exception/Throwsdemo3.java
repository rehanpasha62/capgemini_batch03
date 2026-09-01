package com.tns.Exception;

public class Throwsdemo3 {
static void Login(String username, String password) throws Exception{
	if (username.equals("admin")) {
		throw new Exception("Inavlid username");
	}
	if (password.equals("1234")) {
		throw new Exception("invalid password");
	}
	System.out.println("Login Successfully...");
	
}
public static void main(String[] args) {
	try {
		Login("admn","1234");
	}
	catch(Exception s) {
		System.out.println(s.getMessage());
	}
	System.out.println("Login process completed");
}
}