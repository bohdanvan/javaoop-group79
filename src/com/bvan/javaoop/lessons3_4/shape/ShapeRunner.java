package com.bvan.javaoop.lessons3_4.shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Circle c = new Circle(10);

        double a1 = r.getArea();
        double a2 = c.getArea();

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10, 20));
        rectangles.add(new Rectangle(2, 3));

        System.out.println(areaSum(rectangles));

        ArrayList<Circle> circles = new ArrayList<>();

//        areaSum(circles);
    }

    private static double areaSum(ArrayList<Rectangle> rectangles) {
        double areaSum = 0;
        for (Rectangle rectangle : rectangles) {
            areaSum += rectangle.getArea();
        }
        return areaSum;
    }

    private static double areaSumCircle(ArrayList<Circle> rectangles) {
        double areaSum = 0;
        for (Circle circle : rectangles) {
            areaSum += circle.getArea();
        }
        return areaSum;
    }
}
