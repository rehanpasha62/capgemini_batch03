package com.tns.superprograms;

class employee{
	int salary=150000;
}

class Senioremployee extends employee{
	int salary=180000;
	
	void displayinfo(){
		System.out.println("senior employee salary: "+salary);
		System.out.println("Employee salary: "+super.salary);
	}
}

public class Main {
public static void main(String[] args) {
	Senioremployee s=new Senioremployee();
	s.displayinfo();
}
}