package com.tns.Exception;

public class ArthematicExceptionDemo {
public static void main(String[] args) {
	int Salary=50000;
	int Workingdays=25;
	int Bonusdays=5;
	
	try {
		int dailysalary=Salary/Workingdays;
		System.out.println("Daily Salary"+dailysalary);
		
		int bonusperday=Salary/0;
		System.out.println("bonus:"+(bonusperday*Bonusdays));
	}
	catch(ArithmeticException e) {
		System.out.println("cannot calculate salary bonus...");
		System.out.println(e);
	}
	System.out.println("salary processing complete.....");
}
}
 