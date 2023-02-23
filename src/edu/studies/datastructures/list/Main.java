package edu.studies.datastructures.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("bmw"));
        carList.add(new Car("audi"));
        carList.add(new Car("honda"));
        carList.add(new Car("nissan"));
        carList.add(new Car("ford"));
        carList.add(new Car("hyundai"));

//        System.out.println(carList);
//
//        System.out.println(carList.contains(new Car("ford")));
//
//        System.out.println(carList.get(2));
//
//        System.out.println(carList.indexOf(new Car("bmw")));
        System.out.println(carList.remove(2));
        System.out.println(carList);
        carList.clear();
        System.out.println(carList);

    }
}
