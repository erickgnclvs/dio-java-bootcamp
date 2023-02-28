package edu.studies.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciseExampleStream {
    public static void main(String[] args) {

        List<String> list1 =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


        System.out.println("print all elements");
        list1.stream().forEach(System.out::print); // Method reference
        System.out.println("");
        list1.stream().forEach(s -> System.out.print(s)); // Lambda expression
        System.out.println("");
        list1.stream().forEach(new Consumer<String>() { // Anonymous class
            @Override
            public void accept(String s) {
                System.out.print(s);
            }
        });
        System.out.println("");


        System.out.println("take 5 first numbers and put in a set");
        list1.stream().limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::print);
        System.out.println("");


        System.out.println("transform from string to integers");
        list1.stream()
                .map(new Function<String, Integer>() {     // Anonymous function - not used
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });

        list1.stream()
                .map(s -> Integer.parseInt(s));  // Lambda expression

        list1.stream()
                .map(Integer::parseInt);      // Method reference (much cooler)

        List<Integer> list2 = list1.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        list2.stream().collect(Collectors.toList()).forEach(System.out::print);


        System.out.println("\nput even numbers and bigger than 2 in a list");
        list1.stream().map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)  // This is really cool
                .collect(Collectors.toList())
                .forEach(System.out::print);


        System.out.println("\nprint numbers average");
        list1.stream().mapToInt(Integer::parseInt)
                .average().ifPresent(System.out::println);


        System.out.println("remove odd numbers");
        list2.removeIf(i -> i % 2 != 0);
        System.out.println(list2);

    }
}
