package com.bvan.javaoop.lessons7_8.sorting;

import com.bvan.javaoop.lessons5_6.format.Product;

import java.util.Comparator;

/**
 * @author bvanchuhov
 */
public class ComparatorExample {

    public static void main(String[] args) {
        Product macBook = new Product("MacBook", 2000);
        Product lenovo = new Product("Lenovo", 1500);
        Product asus = new Product("Asus", 1500);

        Comparator<Product> comp = new NameComparator();
        int compare = comp.compare(macBook, lenovo); // > 0
        System.out.println("comp " + compare);

        System.out.println(Integer.compare(10, 20)); // -1
        System.out.println(Integer.compare(40, 10)); // 1
        System.out.println(Integer.compare(60, 60)); // 0
        System.out.println();

        System.out.println("ABCD".compareTo("XFG")); // < 0
        System.out.println("Home".compareTo("Homework")); // < 0
    }
}
