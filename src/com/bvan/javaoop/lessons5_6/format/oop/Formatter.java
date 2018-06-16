package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
@FunctionalInterface
public interface Formatter {

    String format(Product product);

    default void print(Product product) {
        System.out.println(format(product));
    }
}
