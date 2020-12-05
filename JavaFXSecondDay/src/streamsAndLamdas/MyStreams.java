package streamsAndLamdas;

import java.util.stream.Stream;

public class MyStreams {
    public static void main(String[] args) {

        // 0, 1, 1, 2, 3, 5, 8

//        Stream.iterate(65, x -> (x + 1))
//                .limit(26)
//                .map(a -> Character.toChars(a))
//                .forEach(System.out::print);

//        int[] intArray = {2, -6, -3, 7, 0, 90, 4, -2};
//        int limit = -4;
//        IntStream intStream = Arrays.stream(intArray);
//
//        intStream
//                .filter(value -> value > limit)
//                .map(streamsAndLamdas.MyStreams::multiplyBy3)
//                .map(operand -> operand / 3)
//                .sorted()
//                .forEach(e -> System.out.printf("%d, ", e));


//        long numOfObj = Stream.of(1, 2, 3, 1).distinct().count();     // 3
//        double total = Stream.of(1.23, 2.3).mapToDouble(d -> d).sum();  // 3.53
//        int minVal = Stream.of(1, 2, 3).mapToInt(value -> value).min().getAsInt(); // 1
//        int maxVal = Stream.of(1, 2, 3).mapToInt(value -> value).max().getAsInt(); // 3

//        System.out.println(numOfObj);
//        System.out.println(total);
//        System.out.println(minVal);
//        System.out.println(maxVal);

//        int mul = Stream.of(1, 2, 3, 4, 5).reduce(1, (x, y) -> x * y);
//        int sum1 = Stream.of(1, 2, 3, 4, 5).reduce(0, (x, y) -> x + y);
//
//        System.out.println(mul);
//        System.out.println(sum1);

//        Stream<Character> fromBuilder = Stream.<Character>builder().add('0').add('1').build();
//
//        fromBuilder.
//                forEach(character -> System.out.println(character));

//        Stream<Character> chars = Stream.generate(() -> (char) 90).limit(1);
////        System.out.println(chars);
//
//        chars.forEach(System.out::println);
//
//        Stream<Integer> characterStream = Stream.iterate(60, a -> a + 1).limit(5);
//        characterStream.forEach(System.out::println);


//        char[] alphabet = Stream
//                .iterate('A', character -> (char) (character + 1))
//                .limit(26)
//                .map(a->a.toString())
//                .reduce("", (a, b) -> a + b).toCharArray();
//
//        System.out.println(alphabet);
//
//        Stream<Integer> characterStream2 = Stream.iterate(60, a -> a + 1).limit(5);

//        characterStream1.forEach(System.out::println);
//        characterStream2.forEach(System.out::println);
//        Stream<String> characterStream =

//        Stream.iterate(65, x -> (x + 1))
//                .limit(26)
//                .map(a -> Character.toChars(a))
//                .forEach(System.out::print);
//
//        System.out.println();
//
//        Stream.iterate(97, x -> (x + 1))
//                .limit(26)
//                .map(a -> Character.toChars(a))
//                .forEach(System.out::print);
//
//        System.out.println();
//
//        Stream.iterate(90, x -> (x - 1))
//                .limit(26)
//                .map(a -> Character.toChars(a))
//                .forEach(System.out::print);
//
//        System.out.println();
//
//        Stream.iterate(122, x -> (x - 1))
//                .limit(26)
//                .map(a -> Character.toChars(a))
//                .forEach(System.out::print);
//
//        System.out.println();
//
//        Stream.iterate('a', x -> (char) (x + 1))
//                .limit(26)
//                .forEach(System.out::print);
//
//        System.out.println();
//
//        Stream.iterate('A', x -> (char) (x + 1))
//                .limit(26)
//                .forEach(System.out::print);
//
//        System.out.println();
//
//        Stream.iterate('z', x -> (char) (x - 1))
//                .limit(26)
//                .forEach(System.out::print);
//
//        System.out.println();
//
//        Stream.iterate('Z', x -> (char) (x - 1))
//                .limit(26)
//                .forEach(System.out::print);


//        DoubleStream doubleStream = (new Random().doubles(5));
//        DoubleStream doubleStream1 = (new Random().doubles(5));
//
//        doubleStream.forEach(value -> System.out.println(value));
//
//        doubleStream1.forEach(System.out::println);

//        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//        int sum = list.stream()
//                .filter(integer -> (integer % 2 != 0))
//                .max(Comparator.naturalOrder());
//                .reduce(0, Integer::sum);

//        System.out.println(sum);
//
//        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
//        String result = letters
//                .stream()
//                .filter(s -> s.equals("a"))
//                .reduce("", String::concat);
//
//        System.out.println(result);

    }


    private static int multiplyBy3(int i) {
        return i * 3;
    }
}
