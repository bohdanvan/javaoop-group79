package com.bvan.javaoop.lessons11_12.multithreading;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ListExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        List<String> subList = list.subList(0, 2);
        System.out.println(subList);

        subList.set(0, "X");

        System.out.println(list);

    }
}
