package task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Task8Test {

    @Test
    void b_after_a_test() {
        double[] a = {1, 2, 3, 4};
        double[] b = {5, 6, 7, 8};
        int[] actualResult = Task8.findIndices(a, b);
        int[] expectedResult = {3, 3, 3, 3};
        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    void b_in_a_test() {
        double[] a = {1, 2, 4, 6};
        double[] b = {3, 5, 7};
        int[] actualResult = Task8.findIndices(a, b);
        int[] expectedResult = {2, 3, 3};
        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    void b_before_a_test() {
        double[] a = {1, 2, 3, 4, 5, 6};
        double[] b = {0, 0, 0};
        int[] actualResult = Task8.findIndices(a, b);
        int[] expectedResult = {0, 0, 0};
        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}