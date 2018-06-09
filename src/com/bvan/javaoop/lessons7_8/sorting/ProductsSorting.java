package com.bvan.javaoop.lessons7_8.sorting;

import com.bvan.javaoop.lessons5_6.format.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProductsSorting {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));
        products.add(new Product("Asus", 1500));

        Comparator<Product> c = new PriceComparator()
                .thenComparing(new NameComparator().reversed());

        Collections.sort(products, c);

        System.out.println(products);
    }
}
