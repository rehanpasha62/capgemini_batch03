package com.tns.LambdaExpressionDemo;
import java.util.Scanner;
@FunctionalInterface
interface circle{
	double calculate(double radius);
}
public class TestDemo2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the nadius of the circle");
	double radius = sc.nextDouble();
	circle area = (r)->{
		return 3.14*r*r;
	};
	System.out.println("area of circle: "+area.calculate(radius));
}
}
