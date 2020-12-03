import java.util.Arrays;
import java.util.List;

public class Excercise {
    public static void main(String[] args) {
        List<Integer> digits = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = 0;

        Excercise excercise = new Excercise();

        sum = digits.stream()
//                .filter(Excercise::isOdd)
                .filter(integer -> isOdd(integer))
//                .filter(integer -> excercise.isOddNonStatic(integer))
                .reduce(0, Integer::sum);


        System.out.println(sum);


        "caasfa".compareTo("dasdaf");

    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public boolean isOddNonStatic(int value) {
        return value % 2 != 0;
    }

}
