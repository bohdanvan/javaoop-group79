package com.bvan.javaoop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class MultithreadingWithLambda {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int x = i;
            new Thread(() -> ThreadUtils.println("Hello " + x))
                    .start();
        }

    }
}
