package com.tns.Inheritancedemo;
//demo for inheritance (single level)
class Father{   // parent class
	int money=50000;  // variables 
	String car="BMW";
	
	void read() {
		System.out.println("reading a news paper");//methods
	}
}
class Son extends Father{  // child class
	String cycle="blue";
	
	void play() {
		System.out.println("playing cirket");
	}

}
public class Maindemo {
	public static void main(String[] args) {
		Son s=new Son();
		System.out.println(s.money);//p
		System.out.println(s.car);//p
		System.out.println(s.cycle);//s
		s.read();
		s.play();
	}

}