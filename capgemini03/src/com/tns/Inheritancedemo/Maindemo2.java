package com.tns.Inheritancedemo;
//demo for multi level 
class Vehicle{
	
	String colour="black";
	void speed() {
		System.out.println("high speed");
	}
}
class Car extends Vehicle{
	void engine() {
		System.out.println("good");
	}
}
class minicar extends Car{
	void show() {
		System.out.println("good speed");
	}
}

public class Maindemo2 {
public static void main(String[] args) {
	minicar m=new minicar();
	m.speed();
	m.engine();
	m.show();
Car c=new Car();
c.speed();


}
}