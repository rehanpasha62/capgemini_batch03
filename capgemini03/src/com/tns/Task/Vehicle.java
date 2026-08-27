package com.tns.Task;

class Vehicle1 {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle1 v1 = new Car();
        Vehicle1 v2 = new Bike();

        v1.start();
        v2.start();
    }
}