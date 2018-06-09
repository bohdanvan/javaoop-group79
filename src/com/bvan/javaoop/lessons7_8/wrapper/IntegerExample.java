package com.bvan.javaoop.lessons7_8.wrapper;

/**
 * @author bvanchuhov
 */
public class IntegerExample {

    public static void main(String[] args) {
        Integer x = 10; // Integer.valueOf(10); // autoboxing
        Integer y = 20; // Integer.valueOf(20);
        Integer z = x + y; // Integer.valueOf(x.intValue() + y.intValue());

        System.out.println("z = " + z);
    }
}
