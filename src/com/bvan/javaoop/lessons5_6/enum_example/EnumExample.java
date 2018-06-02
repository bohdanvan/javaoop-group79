package com.bvan.javaoop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public class EnumExample {

    public static void main(String[] args) {
        Genre g1 = Genre.COMEDY;
        System.out.println(g1);

        // String -> enum
        Genre g2 = Genre.valueOf("ACTION");
        System.out.println(g2);

        // int -> enum
        Genre[] genres = Genre.values();
        Genre g3 = genres[2];
        System.out.println(g3);

        // enum -> String
        String name = g2.name();
        System.out.println(name);

        // enum -> int
        int ordinal = g2.ordinal();
        System.out.println(ordinal);

        System.out.println(g2.getShortName());

        System.out.println(Genre.THRILLER == Genre.THRILLER);

        System.out.println(Genre.COMEDY.toString());
    }
}
