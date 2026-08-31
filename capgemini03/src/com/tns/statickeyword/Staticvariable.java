package com.tns.statickeyword;

// Demo for Static variable

class Employee{
	int id;
	String name;
	static String company="TCS";
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
		}
	void display() {
		System.out.println(id+" "+name+" "+company);
	}
}
public class Staticvariable {
public static void main(String[] args) {
	Employee e1=new Employee(101,"Manoj");
	Employee e2=new Employee(102,"Shoaib");
	Employee e3=new Employee(103,"Shabu");
	Employee e4=new Employee(104,"Dileep");
	
	e1.display();
	e2.display();
	e3.display();
	e4.display();
	
}
}