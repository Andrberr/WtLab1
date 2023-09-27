package task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class BasketTest {

    @Test
    void basket_hold_all_balls_test() {
        Ball ball1 = new Ball(8, Color.BLUE);
        Ball ball2 = new Ball(8, Color.BLUE);
        Ball ball3 = new Ball(8, Color.RED);
        Ball ball4 = new Ball(8, Color.BLUE);
        Ball ball5 = new Ball(8, Color.GREEN);

        Basket basket = new Basket(50);

        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);
        basket.addBall(ball5);

        int actualResult = basket.getBlueBallsCount();
        int expectedResult = 3;
        Assertions.assertEquals(basket.currentWeight, 40);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void basket_hold_not_all_balls_test() {
        Ball ball1 = new Ball(5, Color.ORANGE);
        Ball ball2 = new Ball(30, Color.RED);
        Ball ball3 = new Ball(10, Color.GREEN);

        Basket basket = new Basket(35);

        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);

        int actualResult = basket.getBlueBallsCount();
        int expectedResult = 0;
        Assertions.assertEquals(basket.currentWeight, 35);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}