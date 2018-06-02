package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));

        Formatter formatter = new CsvFormatter("|");
        cart.print(formatter);

        // anonymous class
        cart.print(toStringFormatter());
    }

    // static factory method
    public static Formatter csvFormatter(String delimiter) {
        return new CsvFormatter(delimiter);
    }

    public static Formatter toStringFormatter() {
        // anonymous class
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }
}
