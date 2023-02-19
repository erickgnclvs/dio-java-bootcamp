import java.util.Scanner;

public class LoopsAndArrays {
    Scanner scan = new Scanner(System.in);

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

    public static void main(String[] args) {
        LoopsAndArrays laa = new LoopsAndArrays();
        laa.number();
        laa.lineSeparator();
        laa.biggestAndAverage();
        laa.lineSeparator();
        laa.oddAndEven();
        laa.lineSeparator();
    }
}
