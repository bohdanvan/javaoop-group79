package com.bvan.javaoop.lessons1_2.dynamicarray.oop;

/**
 * @author bvanchuhov
 */
public class TestDynamicArray {

    public static void main(String[] args) {
        DynamicArray d1 = new DynamicArray();
        d1.addLast(10);
        d1.addLast(20);

        DynamicArray d2 = new DynamicArray();
        d2.addLast(100);
        d2.addLast(300);

        System.out.println(d1.toString() + " " + d2.toString());
    }
}
