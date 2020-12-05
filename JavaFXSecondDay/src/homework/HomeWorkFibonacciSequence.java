package homework;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HomeWorkFibonacciSequence {
    public static void main(String[] args) {

        // Fibonacci sequence starting from 0
        Stream.iterate(new int[]{0, 1}, array -> new int[]{array[1], array[0] + array[1]})
                .limit(10)
                .map(array -> array[0])
                .forEach(System.out::println);

        System.out.println();

        // Fibonacci sequence starting from 1
        Stream.iterate(new int[]{1, 1}, array -> new int[]{array[1], array[0] + array[1]})
                .limit(10)
                .map(array -> array[0])
                .forEach(System.out::println);

//        // Fibonacci sequence starting from 0
//        final int[] previous = {1};
//
//        IntStream.iterate(0, number -> {
//            number = number + previous[0];
//            previous[0] = number - previous[0];
//            return number;
//        })
//                .limit(10)
//                .forEach(System.out::println);
//
//
//        // Fibonacci sequence starting from 1
//        final int[] previous1 = {0};
//
//        IntStream.iterate(1, number -> {
//            number = number + previous1[0];
//            previous1[0] = number - previous1[0];
//            return number;
//        })
//                .limit(10)
//                .forEach(System.out::println);
//
//
//    }
    }
}