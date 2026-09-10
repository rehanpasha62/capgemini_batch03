package com.tns.Stringprograms;

public class ImmutableDemo {
public static void main(String[] args) {
String s1= "Sachin";
String s2=s1;
String s3=s2;
  
System.out.println("s1: "+s1);
System.out.println("s2: "+s2);
System.out.println("s3: "+s3);

s1="Tendulkar";

System.out.println("s1: "+s1);
System.out.println("s2: "+s2);
System.out.println("s3: "+s3);
}
}