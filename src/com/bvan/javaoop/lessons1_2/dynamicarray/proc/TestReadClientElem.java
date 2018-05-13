package com.bvan.javaoop.lessons1_2.dynamicarray.proc;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class TestReadClientElem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = DynamicArrayApp.readElem(scanner);
        System.out.println(n);
    }
}
