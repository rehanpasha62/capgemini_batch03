package com.tns.abstraction;

abstract class Employee{
	void calculateSalary() {
		
	}
class FullTimeEmployee extends Employee{
	void calculateSalary() {
		System.out.println("full time employee salary: 20000");
	}
}
class PartTimeEmployee extends Employee{
	void calculateSalary() {
		System.out.println("part time employee salary: 14000");
	}
}

}

public class Salary {
public static void main(String[] args) {
	
	FullTimeEmployee f= new FullTimeEmployee();
	PartTimeEmployee p = new PartTimeEmployee();
	f.calculatesalary();
	p.calculatesalary();
}
}
