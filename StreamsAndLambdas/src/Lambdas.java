public class Lambdas {
    public static void main(String[] args) {
        Calculator mul = (double x, double y) -> x * y;
        Calculator div = ((x, y) -> x / y);
        Calculator pow = ((x, y) -> Math.pow(x, y));
        Calculator powItself = (x, y) -> Math.pow(x, x);

//        System.out.println(mul.calc(4, 5));
//        System.out.println(div.calc(4, 5));
//        System.out.println(pow.calc(4, 5));
//        System.out.println(powItself.calc(4, 5));

        Calculator subtract = Lambdas::sub;

        System.out.println(sub(5, 32));
    }

    static double sub(double x, double y) {
        return x - y;
    }

}
