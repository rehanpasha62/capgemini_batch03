package com.tns.superprograms;

class Person{
	String name;
	
	Person(String name){
		this.name=name;
		System.out.println("person costr");
	}
}
class Student extends Person{
	int rollno;
	Student(String name,int rollno){
		super(name);
		this.rollno=rollno;
		System.out.println("student constr");
	}
}
public class SuperConstructor {
public static void main(String[] args) {
	Student s=new Student("Rahul",101);
	System.out.println(s.rollno);
}
}