package com.tns.Task;

// task for method overloading

class Calculatormain {

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

public class Calculator {
    public static void main(String[] args) {

        Calculatormain c = new Calculatormain();

        System.out.println("Area of Circle: " + c.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + c.calculateArea(10.0, 5.0));
        System.out.println("Area of Square: " + c.calculateArea(4));
    }
}