package com.tns.superprograms;

class Employe1{
	void calculatePerformance() {
		System.out.println("Calculating employee performance");
	}
}

class Senioremployee1 extends Employe1{
	@Override
	void calculatePerformance() {
		
		super.calculatePerformance();
		
		
		System.out.println("Calculating leadership performance");
	}
}

public class Supermethod {
public static void main(String[] args) {
	
}
}