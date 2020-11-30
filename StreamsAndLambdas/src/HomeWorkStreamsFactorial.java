import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

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


        // factorial solution 1
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= inputNumber; i++) {
            list.add(i);
        }

        factorial = list.stream()
                .reduce(1, (x, y) -> x * y);

        System.out.printf("Factorial from solution 1: %d\n", factorial);


        // factorial solution 2
        IntStream intStream = IntStream.rangeClosed(1, inputNumber);
        factorial = intStream.reduce(1, (x, y) -> x * y);
        System.out.printf("Factorial from solution 2: %d", factorial);
    }
}
