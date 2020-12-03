import java.util.stream.Stream;

public class HomeWorkAlphabetDecreasing {
    public static void main(String[] args) {

        System.out.println();

        Stream.iterate(90, x -> (x - 1))
                .limit(26)
                .map(a -> Character.toChars(a))
                .forEach(System.out::print);

        System.out.println();

        Stream.iterate('Z', x -> (char) (x - 1))
                .limit(26)
                .forEach(System.out::print);

        System.out.println();
    }
}
