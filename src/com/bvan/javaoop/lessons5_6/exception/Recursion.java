package com.bvan.javaoop.lessons5_6.exception;

/**
 * @author bvanchuhov
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(1_000_000));
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative n: " + n);
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
