package edu.studies.datastructures;

public class AttributionAndReference {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA: " + intA + " intB: " + intB);

        intA = 2;
        System.out.println("intA: " + intA + " intB: " + intB);

        MyObject objA = new MyObject(1);
        MyObject objB = objA;

        System.out.println("objA: " + objA + " objB: " + objB);

        objA.setNum(2);
        System.out.println("objA: " + objA + " objB: " + objB);

    }
}
