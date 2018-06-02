package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class TestCsvFormatter {

    public static void main(String[] args) {
        CsvFormatter csvFormatter = new CsvFormatter();
        String s = csvFormatter.format(new Product("", 10));
        System.out.println(s);
    }
}
