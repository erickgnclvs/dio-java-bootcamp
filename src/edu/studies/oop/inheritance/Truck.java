package edu.studies.oop.inheritance;

public class Truck extends Vehicle {
    public Truck() {
        this.type = "truck";
    }

    public Truck(String color, String model, String brand, int year) {
        super(color, model, brand, year);
        this.type = "truck";
    }
}
