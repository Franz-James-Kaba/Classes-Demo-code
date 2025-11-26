package com.lab;

public class Main {
    public static void main(String[] args) {

        // Create a Car instance
        Car myCar = new Car("Toyota", "Corolla", 4, "Red", 2020);

        // Display car information
        myCar.displayInfo();
        System.out.println();

        // Use the drive method
        myCar.drive(150.5);
        myCar.drive(75.2);
        System.out.println();

        // Use the honk method
        myCar.honk();
        System.out.println();

        // Use setters to update car properties
        myCar.setPrice(18500.00);
        myCar.setFuelType("Hybrid");
        System.out.println("Car description: " + myCar.getCarDescription());
        System.out.println();

        // Repaint the car
        myCar.repaint("Blue");
        System.out.println();

        // Display updated information
        myCar.displayInfo();
        System.out.println();

        // Use toString method
        System.out.println("toString(): " + myCar.toString());
    }
}