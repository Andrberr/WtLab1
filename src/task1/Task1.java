package task1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(calculate(0, 0));
        System.out.println(calculate(3.5, 5.6));
        System.out.println(calculate(14, 38));
    }

    public static double calculate(double x, double y) {
        double operation = 1 + Math.pow(Math.sin(x + y), 2);
        return operation / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }
}
