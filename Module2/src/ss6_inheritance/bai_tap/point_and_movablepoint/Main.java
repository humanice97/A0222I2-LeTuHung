package ss6_inheritance.bai_tap.point_and_movablepoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.3f, 5.2f);
        System.out.println(point);
        point.setXY(3, 2);
        System.out.println(Arrays.toString(point.getXY()));

        MovablePoint movablePoint = new MovablePoint(1.3f, 3.2f, 2, 2);
        System.out.println(movablePoint);
        movablePoint.setSpeed(5, 5);
        System.out.println(movablePoint.move());
    }
}
