package javafx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

//        IntStream.rangeClosed(1,10)
//                .map(operand -> 2 * operand)
////                .flatMap();
//        .distinct()
//                .peek(value -> value)
//                .

        List<String> list1 = new ArrayList<>(List.of("a", "b", "c"));
        List<String> list2 = new ArrayList<>(List.of("d", "e", "f"));

        Stream<List> stream = Stream.of(list1, list2);

        stream
                .flatMap(list -> list.stream())
                .forEach(System.out::println);


// intermediate
//        filter()
//        map()
//        flatMap()
//        distinct()
//        sorted()
//        peek()
//        limit()
//        skip()


// terminal
//        forEach()
//        forEachOrdered()
//        toArray()
//        reduce()
//        collect()
//        min()
//        max()
//        count()
//        anyMatch()
//        allMatch()
//        noneMatch()
//        findFirst()
//        findAny()

    }
}
