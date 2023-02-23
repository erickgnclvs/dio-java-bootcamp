package edu.studies.datastructures.equalsandhashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("ford"));
        carList.add(new Car("chevrolet"));
        carList.add(new Car("bmw"));
        carList.add(new Car("audi"));

        System.out.println(carList.contains(new Car("ford")));
        System.out.println(new Car("ford").hashCode());
        System.out.println(new Car("ford2").hashCode());

        Car car1 = new Car("Lamborghini");
        Car car2 = new Car("Ferrari");

        System.out.println(car1.equals(car2));

    }
}
