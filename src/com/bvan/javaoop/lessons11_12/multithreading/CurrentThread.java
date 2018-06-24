package com.bvan.javaoop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class CurrentThread {

    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());
        System.out.println(currentThread.getId());
    }
}
