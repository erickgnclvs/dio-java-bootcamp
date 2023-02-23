package edu.studies.datastructures.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Car> carHashSet = new HashSet<>();

        carHashSet.add(new Car("bmw"));
        carHashSet.add(new Car("audi"));
        carHashSet.add(new Car("ford"));
        carHashSet.add(new Car("zonda"));
        carHashSet.add(new Car("lamborghini"));
        carHashSet.add(new Car("ferrari"));

        System.out.println(carHashSet);

        System.out.println(carHashSet.size());

        Set<Car> carTreeSet = new TreeSet<>();

        carTreeSet.add(new Car("bmw"));
        carTreeSet.add(new Car("audi"));
        carTreeSet.add(new Car("ford"));
        carTreeSet.add(new Car("zonda"));
        carTreeSet.add(new Car("lamborghini"));
        carTreeSet.add(new Car("ferrari"));

        System.out.println(carTreeSet);
    }
}
