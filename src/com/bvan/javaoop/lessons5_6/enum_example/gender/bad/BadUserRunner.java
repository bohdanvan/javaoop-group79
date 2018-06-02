package com.bvan.javaoop.lessons5_6.enum_example.gender.bad;

/**
 * @author bvanchuhov
 */
public class BadUserRunner {

    public static void main(String[] args) {
        BadUser john = new BadUser("John", 25, BadUser.MALE);
        System.out.println(john);
    }
}
