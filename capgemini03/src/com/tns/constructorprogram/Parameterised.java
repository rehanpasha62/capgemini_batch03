package com.tns.constructorprogram;

import java.util.Scanner;

class Employe1{
	
	int id;
	String name;
	String department;
	double salary;

	//parameterised constructor
	
Employe1(int id,String name,String department,double salary){
	
	this.id=id;
	this.name=name;
	this.department=department;
	this.salary=salary;
}

void dispalyinfo() {
	
	System.out.println("employee details:");
	System.out.println("employee id"+id);
	System.out.println("employee name "+name);
	System.out.println("department "+department);
	System.out.println("salary "+salary);
}
}


public class Parameterised {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the id");
	int id=sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("employee name");
	String name=sc.nextLine();
			
	System.out.println("enter the department");
	String department=sc.nextLine();
	
	System.out.println("enter the salary");
	Double salary=sc.nextDouble();
	
	Employe1 e=new Employe1(id,name,department,salary);
	e.dispalyinfo();
	sc.close();
}
}
