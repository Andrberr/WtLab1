package task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class Task7Test {

    @Test
    void sort_random_order_test() {
        double[] array = {10, 3, 4, 7, 4, 11, 3, 4, 1};
        String actualResult = Arrays.toString(Task7.increase_sort(array));
        double[] expectedResult = {1, 3, 3, 4, 4, 4, 7, 10, 11};
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }

    @Test
    void sort_increase_order_test() {
        double[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        String actualResult = Arrays.toString(Task7.increase_sort(array));
        double[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }

    @Test
    void sort_decrease_order_test() {
        double[] array = {8, 7, 6, 5, 4, 3};
        String actualResult = Arrays.toString(Task7.increase_sort(array));
        double[] expectedResult = {3, 4, 5, 6, 7, 8};
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }
}