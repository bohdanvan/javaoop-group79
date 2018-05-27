package com.bvan.javaoop.lessons3_4.dish;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Menu italianMenu = new Menu("Italian Kitchen");

        Dish cheapestDish = italianMenu.getCheapestDish();

        System.out.println(cheapestDish);
    }
}
