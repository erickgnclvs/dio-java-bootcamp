package edu.studies.datastructures.set;

import java.util.Objects;

public class Car implements Comparable<Car> {

        String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return Objects.equals(brand, car.brand);
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand);
        }

    @Override
    public int compareTo(Car o) {
        if (this.brand.length() < o.brand.length()) {
            return -1;
        } else if (this.brand.length() > o.brand.length()) {
            return 1;
        }
        return 0;
    }
}
