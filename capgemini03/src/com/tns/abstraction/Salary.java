package com.tns.abstraction;

abstract class Employee {

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {

    double monthlySalary = 50000;

    @Override
    void calculateSalary() {
        System.out.println("Full Time Employee Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {

    int hoursWorked = 80;
    double hourlyRate = 500;

    @Override
    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part Time Employee Salary: " + salary);
    }
}
public class Salary {
	

	public class EmployeeSalarySystem {

	    public static void main(String[] args) {

	        FullTimeEmployee f = new FullTimeEmployee();
	        PartTimeEmployee p = new PartTimeEmployee();

	        f.calculateSalary();
	        p.calculateSalary();
	    }
	}
}