package com.tns.Task;

interface GPS {
    void trackLocation();
    void calculateRoute();
}

interface VehicleSafety {
    void detectCollision();
    void applyEmergencyBrake();
}

class SmartVehicle implements GPS, VehicleSafety {

    String vehicleNumber;
    String model;
    double currentSpeed;
    String location;
    double speedLimit;
    String route;
    boolean collisionDetected;

    // Constructor
    SmartVehicle(String vehicleNumber, String model,
                 double currentSpeed, String location,
                 double speedLimit) {

        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.location = location;
        this.speedLimit = speedLimit;
        this.collisionDetected = false;
    }

    // GPS methods
    public void trackLocation() {
        System.out.println("Current Location: " + location);
    }

    public void calculateRoute() {
        route = "Route: City Center -> Main Road -> Airport";
        System.out.println(route);
    }

    // Vehicle Safety methods
    public void detectCollision() {
        // Example collision condition
        collisionDetected = true;

        if (collisionDetected) {
            System.out.println("WARNING: Collision detected!");
            applyEmergencyBrake();
        } else {
            System.out.println("No collision detected.");
        }
    }

    public void applyEmergencyBrake() {
        currentSpeed = 0;
        System.out.println("Emergency Brake Activated!");
        System.out.println("Vehicle stopped safely.");
    }

    // Check speed
    public void checkSpeed() {
        System.out.println("Current Speed: " + currentSpeed + " km/h");

        if (currentSpeed > speedLimit) {
            System.out.println("WARNING: Speed limit exceeded!");
        } else {
            System.out.println("Speed is within the limit.");
        }
    }

    // Display all vehicle information
    public void displayStatus() {
        System.out.println("\n===== SMART VEHICLE STATUS =====");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Model          : " + model);
        System.out.println("Speed          : " + currentSpeed + " km/h");
        System.out.println("Location       : " + location);
        System.out.println("Route          : " + route);

        if (collisionDetected) {
            System.out.println("Safety Status  : Emergency Brake Activated");
        } else {
            System.out.println("Safety Status  : Safe");
        }

        System.out.println("================================");
    }
}

public class Main {
    public static void main(String[] args) {

        SmartVehicle vehicle = new SmartVehicle(
            "KA01AB1234",
            "Tesla Model 3",
            80,
            "Bangalore",
            60
        );

        vehicle.trackLocation();
        vehicle.calculateRoute();
        vehicle.checkSpeed();
        vehicle.detectCollision();
        vehicle.displayStatus();
    }
}