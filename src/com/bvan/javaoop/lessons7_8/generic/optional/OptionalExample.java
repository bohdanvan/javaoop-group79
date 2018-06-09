package com.bvan.javaoop.lessons7_8.generic.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author bvanchuhov
 */
public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> s = findWithOptional(Arrays.asList("Java", "C++"), 10);
        if (s.isPresent()) {
            String val = s.get();
            System.out.println(val);
        }
    }

    public static Optional<String> findWithOptional(List<String> list, int minLength) {
        for (String s : list) {
            if (s.length() > minLength) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    public static String find(List<String> list, int minLength) {
        for (String s : list) {
            if (s.length() > minLength) {
                return s;
            }
        }
        return null;
    }
}
