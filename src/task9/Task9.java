package task9;

import java.awt.*;

public class Task9 {
    public static void main(String[] args) {
        Ball ball1 = new Ball(9, Color.BLUE);
        Ball ball2 = new Ball(9, Color.BLUE);
        Ball ball3 = new Ball(9, Color.RED);
        Ball ball4 = new Ball(9, Color.BLUE);
        Ball ball5 = new Ball(9, Color.GREEN);

        Basket basket = new Basket(50);

        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);
        basket.addBall(ball5);

        System.out.println(basket.getBlueBallsCount());
        System.out.println(basket.countWeight());
    }
}
