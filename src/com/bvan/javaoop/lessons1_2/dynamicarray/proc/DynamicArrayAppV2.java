package com.bvan.javaoop.lessons1_2.dynamicarray.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicArrayAppV2 {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();
        System.out.println(Arrays.toString(elems));
    }

    public static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        int[] elems = new int[4];

        int n = readElem(scanner);
        while (n != 0) {
            if (size == elems.length) {
                int newSize = (int) (elems.length * 1.5);
                elems = Arrays.copyOf(elems, newSize);
            }
            elems[size] = n;
            size++;

            n = readElem(scanner);
        }
        return Arrays.copyOf(elems, size);
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
