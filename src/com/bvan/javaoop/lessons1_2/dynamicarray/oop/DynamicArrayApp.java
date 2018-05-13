package com.bvan.javaoop.lessons1_2.dynamicarray.oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray elems = readClientElemsFromConsole();
        System.out.println(elems.toString());
    }

    public static DynamicArray readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        DynamicArray elems = new DynamicArray();

        int n = readElem(scanner);
        while (n != 0) {
            elems.addLast(n);
            n = readElem(scanner);
        }
        return elems;
    }

    public static int readElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next();

            System.out.println("Sorry, illegal number");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }

}
