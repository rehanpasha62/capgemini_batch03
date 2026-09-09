package com.tns.CollectionFramework;

import java.util.ArrayList;

class Student implements Comparable<Student>{
	int marks;
	String Name;
	
	//constructor
	public Student (int marks, String name) {
		this.marks = marks;
		this.Name= name; 
	}

	@Override
	public int compareTo(Student o) {
	  return this.marks-o.marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", Name=" + Name + "]";
	}


public class Compareableinterfacedemo {
public static void main(String[] args) {
	ArrayList <Student> s = new ArrayList<> ();
	s.add(new Student (12, "neraj"));
	s.add(new Student (25,"suraj"));
	s.add(new Student (39,"sameer"));
}
}


//@Override
//public int compareTo(Student o) {
	
	//return 0;
//}
}