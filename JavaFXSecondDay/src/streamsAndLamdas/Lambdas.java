package streamsAndLamdas;

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
        Calculator divide = Lambdas::div;

        System.out.println(subtract.calc(5, 32));
        System.out.println(divide.calc(5, 32));
        System.out.println(((Calculator) Lambdas::div).calc(5, 7));

        Lambdas operand = new Lambdas();
        Calculator count = operand::mod;

        System.out.println(count.calc(10, 4));

    }

    static double sub(double x, double y) {
        return x - y;
    }
    static double div(double x, double y) {
        return x / y;
    }

    double mod(double x, double y){
        return x%y;
    }

}
