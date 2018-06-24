package com.bvan.javaoop.lessons11_12.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ConcurrentCollection {

    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(
                new ArrayList<>()
        );
    }
}
