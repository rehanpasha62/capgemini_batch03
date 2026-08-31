package com.tns.constructorprogram;

import java.util.*;


class Employee1
{
	String name;
	int salary;
	
	//Default Constructor
	void Employee(){
		name="Unknown";
		salary=45000;
	}
	void display() {
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
}


public class Constructordemo {
public static void main(String[] args) {
	Employee1 e=new Employee1();
	e.display();
}
}