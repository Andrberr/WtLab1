package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    void check_for_true1() {
        Boolean actualResult = Task2.check(0, 0);
        Boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void check_for_false() {
        Boolean actualResult = Task2.check(7, 0);
        Boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void check_for_true2() {
        Boolean actualResult = Task2.check(-3, -2);
        Boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}