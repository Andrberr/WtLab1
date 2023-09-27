package task6;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(getMatrix(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static String getMatrix(double[] mas) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length; j++) {
                result.append(String.format("%.0f ", mas[j]));
            }
            for (int k = 0; k < i; k++) {
                result.append(String.format("%.0f ", mas[k]));
            }
            result.append("\n");
        }
        return result.toString();
    }
}
