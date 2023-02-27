package edu.studies.oop.upcastdowncast;

public class Casting {

    public static void main(String[] args) {

        // Upcasting - its a Dog but being treated like Animal
        Animal animalOne = new Dog();
        animalOne.makeNoise(); // Overwriting
        doAnimalStuff(animalOne);

        Animal animalTwo = new Cat();
        doAnimalStuff(animalTwo);

    }

    // A method that works with its subclasses
    public static void doAnimalStuff(Animal animal) {

        // Polymorphism - a method that acts differently, depending on the Animal class
        animal.makeNoise();

        // Dangerous - assuming that the animal is a dog
        // without check, can cause ClassCastException
        if(animal instanceof Dog) {
            Dog myDog = (Dog) animal; // Downcast - use only when checking
            myDog.growl();
        }
    }
}
