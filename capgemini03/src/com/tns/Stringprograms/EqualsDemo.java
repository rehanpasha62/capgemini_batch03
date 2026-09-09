package com.tns.Stringprograms;

public class EqualsDemo {
public static void main(String[] args) {
	String s1= "Manoj";
	String s2=new String ("Manoj");
	String s3="Manoj";
	String s4="sneha";
			
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equalsIgnoreCase(s3));
	System.out.println(s1.equalsIgnoreCase(s4));
}
}
