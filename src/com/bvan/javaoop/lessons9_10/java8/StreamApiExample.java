package com.bvan.javaoop.lessons9_10.java8;

import com.bvan.javaoop.lessons5_6.format.Product;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author bvanchuhov
 */
public class StreamApiExample {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("MacBook", 2000),
                new Product("Lenovo", 1500),
                new Product("Asus", 1700)
        );

        // imperative

        for (Product product : products) {
            if (product.getPrice() > 1000 && product.getPrice() < 1800) {
                String name = product.getName();
                System.out.println(name);
            }
        }
        System.out.println();

        // functional

        Function<Product, String> f = p -> p.getName();
        Predicate<Product> pred = p -> p.getPrice() > 1000 && p.getPrice() < 1800;

        Function<String, Integer> f1 = String::length;

        List<Integer> list = products.stream()
                .filter(pred)
                .map(f)
                .map(f1)
                .collect(Collectors.toList());

        System.out.println(list);

        list.forEach(System.out::println);


    }
}
