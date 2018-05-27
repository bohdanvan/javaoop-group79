package com.bvan.javaoop.lessons3_4.shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ShapePolymorphismRunner {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 20);
        double area = shape.getArea();
        System.out.println(area);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10)); // 314
        shapes.add(new Rectangle(10, 20)); // 200
        double areaSum = areaSum(shapes);
        System.out.println("areaSum = " + areaSum);

        Shape s = shapes.get(0);
        if (s instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) s; // BAD PRACTICE
            double width = rectangle.getWidth();
            System.out.println(width);
        }
    }

    private static double areaSum(ArrayList<Shape> shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum += shape.getArea();
        }
        return areaSum;
    }
}
