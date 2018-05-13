package com.bvan.javaoop.lessons1_2.dynamicarray.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    // fields
    int size = 0;
    int[] elems = new int[4];

    // methods (interface + implementation)
    public void addLast(int n) {
        if (size == elems.length) {
            int newSize = (int) (elems.length * 1.5);
            elems = Arrays.copyOf(elems, newSize);
        }

        elems[size] = n;
        size++;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}
