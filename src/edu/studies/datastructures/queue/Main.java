package edu.studies.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Car> carQueue = new LinkedList<Car>();
        carQueue.add(new Car("bmw"));
        carQueue.add(new Car("audi"));
        carQueue.add(new Car("chevy"));
        carQueue.add(new Car("honda"));
        carQueue.add(new Car("nissan"));

        System.out.println(carQueue);

//        System.out.println(carQueue.element());
//        System.out.println(carQueue);

        System.out.println(carQueue.peek());
        System.out.println(carQueue);

        System.out.println(carQueue.poll());
        System.out.println(carQueue);

        System.out.println(carQueue.offer(new Car("renault")));
        System.out.println(carQueue);

        carQueue.add(new Car("bmw"));
        System.out.println(carQueue);

        System.out.println(carQueue.poll());
        System.out.println(carQueue);

    }
}
