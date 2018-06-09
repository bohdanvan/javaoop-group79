package com.bvan.javaoop.lessons7_8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class StringSorting {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Taras", "Ivan", "Masha");

        Collections.sort(names);

        System.out.println(names);
    }
}
