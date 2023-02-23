package edu.studies.datastructures.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Car> carStack = new Stack<>();
        carStack.push(new Car("bmw"));
        carStack.push(new Car("audi"));
        carStack.push(new Car("lamborghini"));
        carStack.push(new Car("mercedes"));
        carStack.push(new Car("honda"));

        System.out.println(carStack);
        System.out.println(carStack.pop());
        System.out.println(carStack);
        System.out.println(carStack.peek());
        System.out.println(carStack);
        System.out.println(carStack.empty());
    }
}
