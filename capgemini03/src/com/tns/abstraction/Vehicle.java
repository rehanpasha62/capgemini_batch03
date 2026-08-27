package com.tns.abstraction;


abstract class Bike{
	
	abstract void Model(int Year);
}

class Sportsbike extends Bike{

	@Override
	void Model(int Year) {
		
		String BikeName="Kawasakhi Ninja";
		System.out.println("Sportsbike Model :"+BikeName);
		
		int amount1=50000;
		System.out.println("Sportsbike Amount :"+amount1);
		
	}
}

class Scooty extends Bike{

	@Override
	void Model(int Year) {
		
		String BikeName="Access";
		System.out.println("Scooty Model :"+BikeName);

		
		int amount2=10000;
		System.out.println("Scooty Amount :"+amount2);
		
	}
	
}

public class Vehicle {
public static void main(String[] args) {
	
	Sportsbike s=new Sportsbike();
	s.Model(2022);
	
	Scooty s1=new Scooty();
	s1.Model(2025);
	}
}