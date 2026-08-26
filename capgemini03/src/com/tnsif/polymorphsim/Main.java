package com.tnsif.polymorphsim;

class Calculator {

    // Circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Square
    int calculateArea(int side) {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Area of Circle: " + c.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + c.calculateArea(10.0, 5.0));
        System.out.println("Area of Square: " + c.calculateArea(4));
    }
}