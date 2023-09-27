package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class Task4Test {

    @Test
    void find_prime_test1() {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 7, 19};
        ArrayList<Integer> actualResult = Task4.findPrimeIndices(sourceArray);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6));
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void find_prime_test2() {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 7, 19, 2, 2, 10, 12};
        ArrayList<Integer> actualResult = Task4.findPrimeIndices(sourceArray);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        Assertions.assertEquals(expectedResult, actualResult);
    }
}