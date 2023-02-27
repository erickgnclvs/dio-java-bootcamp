package edu.studies.oop.upcastdowncast;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("woof woof");
    }

    public void growl() {
        System.out.println("grrrrr");
    }
}
