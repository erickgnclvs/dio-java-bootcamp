package edu.studies.oop.interfaces;

import edu.studies.oop.inheritance.Motorcycle;

public class Calc implements MathOperations{

    public void randomCalc(Motorcycle motorcycle) {
        System.out.println(motorcycle);
    }

    @Override
    public void add(double x, double y) {
        System.out.println(x + y);
    }

    @Override
    public void less(double x, double y) {
        System.out.println(x - y);
    }

    @Override
    public void multiply(double x, double y) {
        System.out.println(x * y);
    }

    @Override
    public void divide(double x, double y) {
        System.out.println(x / y);
    }
}
