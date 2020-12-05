package homework;

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Stream.iterate;

public class HomeWorkStreamsFactorial {
    public static void main(String[] args) {

        int factorial;
        int inputNumber;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter an integer greater or equal to 0 ->  ");
            while (!scanner.hasNextInt()) {
                System.out.print("It is not an integer. Try again: ->  ");
                scanner.nextLine();
            }
            inputNumber = scanner.nextInt();
            scanner.nextLine();
        } while (inputNumber < 0);


        factorial =
                iterate(1, integer -> integer + 1)
                        .limit(inputNumber)
                        .reduce(1, (x, y) -> x * y);
        System.out.printf("Factorial from solution 1.0: %d\n", factorial);
//
        // factorial solution 1
        factorial = IntStream
                .iterate(1, integer -> integer + 1)
                .limit(inputNumber)
                .reduce(1, (x, y) -> x * y);
        System.out.printf("Factorial from solution 1.1: %d\n", factorial);


        // factorial solution 2
        IntStream intStream = IntStream.rangeClosed(1, inputNumber);
        factorial = intStream.reduce(1, (x, y) -> x * y);
        System.out.printf("Factorial from solution 2.0: %d\n", factorial);

        factorial = IntStream
                .rangeClosed(1, inputNumber)
                .reduce(1, (x, y) -> x * y);
        System.out.printf("Factorial from solution 2.1: %d", factorial);
    }
}
