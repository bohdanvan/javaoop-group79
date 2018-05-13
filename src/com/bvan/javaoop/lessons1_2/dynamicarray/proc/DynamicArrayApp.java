package com.bvan.javaoop.lessons1_2.dynamicarray.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicArrayApp {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();
        System.out.println(Arrays.toString(elems));
    }

    public static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[0];

        int n = readElem(scanner);
        while (n != 0) {
            elems = addLastElem(elems, n);
            n = readElem(scanner);
        }
        return elems;
    }

    public static int[] addLastElem(int[] elems, int n) {
        int[] newElems = new int[elems.length + 1];
        for (int i = 0; i < elems.length; i++) {
            newElems[i] = elems[i];
        }
        newElems[newElems.length - 1] = n;
        elems = newElems;
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
