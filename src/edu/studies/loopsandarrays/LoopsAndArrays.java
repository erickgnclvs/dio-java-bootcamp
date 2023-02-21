package edu.studies.loopsandarrays;

import java.util.Random;
import java.util.Scanner;

public class LoopsAndArrays {
    Scanner scan = new Scanner(System.in);

    public void consonants() {
        String[] consonantsArray = new String[6];
        int consonantsAmount = 0;
        int count = 0;

        do {
            System.out.println("letter: ");
            String letter = scan.next();

            if (!(letter.equalsIgnoreCase("a") |
                letter.equalsIgnoreCase("e") |
                letter.equalsIgnoreCase("i") |
                letter.equalsIgnoreCase("o") |
                letter.equalsIgnoreCase("u"))) {
                consonantsArray[count] = letter;
                consonantsAmount++;
            }
            count++;
        } while ( count < consonantsArray.length);

        System.out.println("Consonants: ");

        for (String s : consonantsArray) {
            if (s!=null)
                System.out.print(s + " ");
        }
    }

    public void number() {
        System.out.println("Number: ");
        int number = scan.nextInt();

        while (number < 0 || number > 10) {
            System.out.println("Invalid number. Try again: ");
            number = scan.nextInt();
        }
    }

    public void biggestAndAverage () {
        int number;
        int count = 0;
        int biggest = 0;
        int sum = 0;
        int average = 0;
        do {
            System.out.println("Number: ");
            number = scan.nextInt();
            count++;
            sum = sum + number;
            if (number>biggest) biggest = number;
            average = sum / 5;
            System.out.println("sum: " + sum);
            System.out.println("average: " + average);
            System.out.println("biggest: " + biggest + "\n");
        } while (count < 5);
    }

    public void lineSeparator() {
        System.out.println("\n---------------\n");
    }

    public void oddAndEven() {
        System.out.println("numbers amount: ");
        int numbersAmount = scan.nextInt();
        int number;
        int count = 0;
        int odds = 0;
        int evens = 0;

        do {
            System.out.println("Number: ");
            number = scan.nextInt();
            if (number % 2 == 0) evens++;
            else odds++;
            count++;
        } while ( count < numbersAmount);

        System.out.println("number of odds: " + odds);
        System.out.println("number of evens: " + evens);
    }

    public void multiplicationTable() {
        System.out.println("multiplication table: ");
        int table = scan.nextInt();

        System.out.println("table of " + table);

        for (int i=1; i<=10; i++) {
            System.out.println(table + "X" + i + " = " + (table*i));
        }
    }

    public void factorial() {
        System.out.println("factorial: ");
        int factorial = scan.nextInt();
        int multiplication = 1;
        for (int i=factorial; i>=1; i--) {
            multiplication = multiplication * i;
        }
        System.out.println(multiplication);
    }

    public void inverseOrder() {
        int[] array = {0, -5, 15, 50, 8, 4};

//        int count = 0;
//        while (count < (array.length-1)) {
//            System.out.print(array[count] + " ");
//            count++;
//        }

//        for (int i : array) {
//            System.out.println(i);
//        }

        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void randomNumbers() {
        Random rand = new Random();
        int[] randoms = new int[20];

        for (int i=0; i<randoms.length; i++) {
            int number = rand.nextInt(100);
            randoms[i] = number;
        }

        for (int number : randoms) {
            System.out.print(number + " ");
        }
        System.out.println("\ndoubles: ");
        for (int number : randoms) {
            System.out.print(number*2 + " ");
        }
    }

    public static void main(String[] args) {
        LoopsAndArrays laa = new LoopsAndArrays();
        laa.randomNumbers();
    }
}
