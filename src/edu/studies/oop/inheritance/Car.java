package edu.studies.oop.inheritance;

public class Car extends Vehicle {
    public Car() {
        this.type = "car";
    }

    public Car(String color, String model, String brand, int year) {
        super(color, model, brand, year);
        this.type = "car";
    }
}
