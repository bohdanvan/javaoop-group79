package com.bvan.javaoop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Overloading {

    public static void main(String[] args) {
        double x = sum(10.0, 20);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static double sum(double a, double b) {
        return a + b;
    }
}
