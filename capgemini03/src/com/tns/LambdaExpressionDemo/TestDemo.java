package com.tns.LambdaExpressionDemo;
import java.util.Scanner;
@FunctionalInterface

interface CabFare {
double calculate(double distance);
}
public class TestDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the distance in KM: ");
		double distance=sc.nextDouble();
		CabFare fare=(d)->{
		if(d<=5) {
			return d*15;
		}
		else {
			return(5*15)+((d-5)*12);
		}
	};
	System.out.println("Cab Fare: "+fare.calculate(distance));
}
}