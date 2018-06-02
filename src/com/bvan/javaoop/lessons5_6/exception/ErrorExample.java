package com.bvan.javaoop.lessons5_6.exception;

/**
 * @author bvanchuhov
 */
public class ErrorExample {

    public static void main(String[] args) {
        try {
            int[] ints = new int[2_000_000_000];
            System.out.println(ints);
        } finally {
            System.out.println("Haha");
        }

        System.out.println("Goodbye");
    }
}
