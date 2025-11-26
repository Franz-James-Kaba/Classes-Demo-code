package com.lab;

public class Car {
    protected String brandName;
    protected String modelName;
    protected Integer numberOfTires;
    protected String color;
    protected Integer year;
    protected Double price;
    protected String fuelType;
    protected Double mileage;

    // Constructor
    public Car(String brandName, String modelName, Integer numberOfTires, String color, Integer year ) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.numberOfTires = numberOfTires;
        this.color = color;
        this.year = year;
        this.price = 0.0;
        this.mileage = 0.0;
        this.fuelType = "Gasoline";
    }

    // Getters
    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getNumberOfTires() {
        return numberOfTires;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public Double getMileage() {
        return mileage;
    }

    // Setters
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setMileage(Double mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        }
    }

    // Methods
    public void drive(Double distance) {
        if (distance > 0) {
            this.mileage += distance;
            System.out.println(this.brandName + " " + this.modelName + " drove " + distance + " km. Total mileage: " + this.mileage + " km");
        }
    }

    public void honk() {
        System.out.println(this.brandName + " " + this.modelName + " goes: Beep Beep!");
    }

    public void displayInfo() {
        System.out.println("=== Car Information ===");
        System.out.println("Brand: " + this.brandName);
        System.out.println("Model: " + this.modelName);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Number of Tires: " + this.numberOfTires);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Price: $" + this.price);
        System.out.println("Mileage: " + this.mileage + " km");
    }

    public String getCarDescription() {
        return this.year + " " + this.brandName + " " + this.modelName + " (" + this.color + ")";
    }

    public void repaint(String newColor) {
        this.color = newColor;
        System.out.println("Car repainted to " + newColor);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", numberOfTires=" + numberOfTires +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", fuelType='" + fuelType + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public String sayHello(){
        return "Hello from Car class!";
    }
}
