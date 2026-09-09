package com.tns.Stringprograms;

public class ImmutableDemo2 {
public static void main(String[] args) {
	String s1 ="Sachin";
	String str=new String("hello");
	System.out.println(str);
	str=str.concat("welcome to java");
	System.out.println(str);
	
	String s2 =s1;
	String s3=s2;
	
	System.out.println("before modification: ");
	System.out.println("s1: "+s1);
	System.out.println("s2: "+s2);
	System.out.println("s3: "+s3);
	
	s1="Tendulkar";
	
	System.out.println("After modification: ");
	System.out.println("s1: "+s1);
	System.out.println("s2: "+s2);
	System.out.println("s3: "+s3);
}
}
