package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void calculate_zeros() {
        Double actualResult = Task1.calculate(0, 0);
        Double expectedResult = 0.5;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculate_doubles() {
        Double actualResult = Task1.calculate(3.5, 5.6);
        Double expectedResult = 3.7009957664045228;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculate_ints() {
        Double actualResult = Task1.calculate(14, 38);
        Double expectedResult = 14.123340387974183;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}