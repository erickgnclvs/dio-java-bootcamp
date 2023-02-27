package edu.studies.collections.set;

import java.util.*;

public class ExampleSet {
    public static void main(String[] args) {

        Set<Double> grades = new HashSet<>(Arrays.asList(
                7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(grades.toString());

        System.out.println(grades.contains(5d));

        System.out.println(Collections.min(grades));

        Iterator<Double> iterator = grades.iterator();
        Double sum = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);

        System.out.println(sum/grades.size());

        grades.remove(0d);
        System.out.println(grades);

        Iterator<Double> iterator1 = grades.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 7) iterator1.remove();
        }
        System.out.println(grades);

        Set<Double> grades2 = new LinkedHashSet<>();
        grades2.add(7d);
        grades2.add(8.5);
        grades2.add(9.3);
        grades2.add(5d);
        grades2.add(7d); // duplicate doesn't work
        grades2.add(0d);
        grades2.add(3.6);

        System.out.println(grades2);

        Set<Double> grades3 = new TreeSet<>(grades2);
        System.out.println(grades3);

        grades.clear();
        System.out.println(grades + "" + grades.isEmpty());




    }
}
