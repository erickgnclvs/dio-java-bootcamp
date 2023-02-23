package edu.studies.datastructures.map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> student = new HashMap<>();

        student.put("name", "john");
        student.put("age", "17");
        student.put("average", "8.5");
        student.put("class", "202");

        System.out.println(student);

        System.out.println(student.keySet());
        System.out.println(student.entrySet());
        System.out.println(student.values());

        List<Map<String, String>> studentsList = new ArrayList<>();

        studentsList.add(student);

        Map<String, String> student2 = new HashMap<>();
        student2.put("name", "mary");
        student2.put("age", "18");
        student2.put("average", "7.5");
        student2.put("class", "302");

        studentsList.add(student2);

        System.out.println(studentsList);

        System.out.println(student.containsKey("name"));






    }
}
