package com.bvan.javaoop.lessons1_2.storing;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample { // ArrayList is a mutable object

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Taras");
        names.add("Ivan");

        ArrayList<String> newNames = names;
        newNames.add("Masha");

        System.out.println(names);
    }
}
