package com.tns.Stringprograms;

public class StringDemo {
public static void main(String[] args) {
	
	//creating a string
	String s ="Hello java programming";
	//length()
	System.out.println("length: "+s.length());
	
	//charAt()
	System.out.println("character at the index 6: "+s.charAt(6));
	
	//to uppercase and lower case
	System.out.println("Upper case:"+s.toUpperCase());
	System.out.println("lower case: "+s.toLowerCase());
	
	//contains
	System.out.println(s.contains("java"));
	
	//startwith 
	System.out.println(s.startsWith("word"));
	
	//ends with
	System.out.println(s.endsWith("Hello"));
	
	System.out.println(s.substring(6,10));
	System.out.println(s.replace("java","python"));
}
}
