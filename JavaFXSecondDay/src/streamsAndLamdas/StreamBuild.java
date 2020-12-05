package streamsAndLamdas;

import java.util.stream.Stream;

public class StreamBuild {
    public static void main(String[] args) {
//        Stream<String> empty = Stream.empty();
//        Stream<String> names = Stream.of("Joe", "John", "Joshua");
//        Stream<Double> doubles = Stream.of(3.3, 2.8, 9.8);
//
//        List<Integer> integers = new ArrayList<>(List.of(2,3,4,5,6));
//        int[] integers1 = {2,3,4,5,6};
//        Stream<Integer> streamFromIntegers = integers.stream();
//
//        IntStream intStream = IntStream.rangeClosed(3,6);
//        IntStream intStream1 = IntStream.of(3,4,4,4,5);
//        IntStream intStream2 = Arrays.stream(integers1);
//
//        IntStream intStream3 = IntStream.of(integers1);
//
//        IntStream intStream4 = IntStream.rangeClosed(1, 500);
//
//        IntStream intStream5 = IntStream.rangeClosed(1, 932140);
//
//        System.out.println(intStream5.sum());

//        Stream<Integer> stream = Stream.iterate(0, integer -> integer +3).limit(10);
//        Stream.iterate(0, integer -> integer + 3).limit(10).forEach(System.out::println);
//
//
//        Stream.iterate(new int[]{0, 1}, ints -> new int[]{ints[1], ints[0] + ints[1]})
//                .limit(10)
//                .map(ints -> ints[0])
//                .forEach(System.out::println);

        //sum of n first Fibonnacci
        int sumFib = Stream.iterate(new int[]{0, 1}, ints -> new int[]{ints[1], ints[0] + ints[1]})
                .limit(10)
                .map(ints -> ints[0])
                .mapToInt(value -> value)
                .sum();
//                .reduce(0, (x,y) -> x+y);
//                .reduce(0, (x,y) -> x+y);
//                .reduce(0, Integer::sum);

        System.out.println(sumFib);

//                .forEach(System.out::println);

//
//        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
//                .limit(20)
//                .map(n -> n[0])
//                .forEach(x -> System.out.println(x));

    }

}
