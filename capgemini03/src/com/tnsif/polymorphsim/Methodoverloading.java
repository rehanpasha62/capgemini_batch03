package com.tnsif.polymorphsim;

// Demo for Method overloading

class Studentresult{
	void calculaterresult(int math,int java,int dbms) {
		int total=math+java+dbms;
		System.out.println("total marks :"+total);
	}
	void calculaterresult(int math,int python) {
		int total=math+python;
		System.out.println("total marks :"+total);
	}
	void calculaterresult(int totalmarks,double bonus) {
		double finalmarks=totalmarks+bonus;
		System.out.println("fianlmarks :"+finalmarks);
	}
}
public class Methodoverloading {
public static void main(String[] args) {
	Studentresult s=new Studentresult();
	s.calculaterresult(70 ,50 , 90);
	s.calculaterresult(50, 70);
	s.calculaterresult(80, 5.0);
}
}