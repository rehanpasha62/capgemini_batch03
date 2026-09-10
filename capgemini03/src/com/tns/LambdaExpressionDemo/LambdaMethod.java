package com.tns.LambdaExpressionDemo;
import java.util.Scanner;

interface ElectricityBill{
	double calculate(int units);
	
public class LambdaMethod {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the electric bil:");
	int units=sc.nextInt();
	//lambda expression
	ElectricityBill bill=(u)->{
			if(u<=100) {
				return u*3;
			}
			else if (u<=200) {
				return(100*3)+((u-100)*5);	
			}
			else {
				return(100*3)+(100*5)+((u-200)*7);
			}
};
System.out.println("electricity bill "+bill.calculate(units));
}
}
} 