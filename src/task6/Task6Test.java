package task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task6Test {

    @Test
    void result_matrix_print_test() {
        String actualResult = Task6.getMatrix(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        String expectedResult = """
                1 2 3 4 5 6 7 8 9\s
                2 3 4 5 6 7 8 9 1\s
                3 4 5 6 7 8 9 1 2\s
                4 5 6 7 8 9 1 2 3\s
                5 6 7 8 9 1 2 3 4\s
                6 7 8 9 1 2 3 4 5\s
                7 8 9 1 2 3 4 5 6\s
                8 9 1 2 3 4 5 6 7\s
                9 1 2 3 4 5 6 7 8\s
                """;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}