package edu.studies.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car(); // upcasting
        Vehicle truck1 = new Truck();
        Vehicle motorcycle1 = new Motorcycle();

        Car newCar = (Car) new Vehicle(); // downcast - its a concept, but doesn't work
        System.out.println(newCar);
    }
}
