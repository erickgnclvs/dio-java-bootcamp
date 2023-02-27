package edu.studies.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {
        List<Double> listOne = new ArrayList<>(); // Recommended because it is treated as the interface (base class)
        ArrayList<Double> listTwo = new ArrayList<>(); // Not recommended

        Cat simba = new Cat("Simba", "yellow", 2);
        Cat alex = new Cat("Alex", "grey", 1);
        Cat john = new Cat("John", "black", 2);

        List<Cat> myCats = new ArrayList(){{
            add(simba);
            add(alex);
            add(john);
        }};

        myCats.add(new Cat("Don", "white", 3));
        System.out.println(myCats);

        Collections.sort(myCats);
        System.out.println(myCats);

        myCats.sort(new ComparatorAge());
        System.out.println(myCats);

        myCats.sort(new ComparatorColor());
        System.out.println(myCats);
    }
}
