package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Test {

    @Test
    public void test_for_correct_table(){
        String actualResult = Task3.function(0, 2, 0.5);
        String expectedResult = """
                | 0.0000 | 0.0000 |
                | 0.5000 | 0.5463 |
                | 1.0000 | 1.5574 |
                | 1.5000 | 14.1014 |
                | 2.0000 | -2.1850 |
                """;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}