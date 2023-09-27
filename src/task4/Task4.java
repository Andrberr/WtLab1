package task4;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 7, 9, 13, 14, 15, 19};
        ArrayList<Integer> primeIndices = findPrimeIndices(sourceArray);
        System.out.println(primeIndices);
    }

    public static ArrayList<Integer> findPrimeIndices(int[] array) {
        ArrayList<Integer> primeIndices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                primeIndices.add(i);
            }
        }

        return primeIndices;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            int temp = n % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}