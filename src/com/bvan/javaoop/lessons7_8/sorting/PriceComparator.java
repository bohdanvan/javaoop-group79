package com.bvan.javaoop.lessons7_8.sorting;

import com.bvan.javaoop.lessons5_6.format.Product;

import java.util.Comparator;

/**
 * @author bvanchuhov
 */
public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product a, Product b) {
        return Long.compare(a.getPrice(), b.getPrice());
    }
}
