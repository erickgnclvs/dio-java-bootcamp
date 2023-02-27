package edu.studies.oop.inheritance;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        this.type = "motorcycle";
    }

    public Motorcycle(String color, String model, String brand, int year) {
        super(color, model, brand, year);
        this.type = "motorcycle";
    }
}
