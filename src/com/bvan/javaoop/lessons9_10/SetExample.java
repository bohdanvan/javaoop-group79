package com.bvan.javaoop.lessons9_10;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        List<String> langs = createLangs();

//        Set<String> uniqueLangs = new LinkedHashSet<>();
//        for (String lang : langs) {
//            uniqueLangs.add(lang);
//        }
        Set<String> uniqueLangs = new LinkedHashSet<>(langs);

        System.out.println(uniqueLangs);
    }

    public static List<String> createLangs() {
        return Arrays.asList(
                "Java",
                "Java",
                "Python",
                "Java",
                "JavaScript",
                "Java",
                "Python",
                "Java",
                "Haskell",
                "Java",
                "JavaScript",
                "Python",
                "Python",
                "Haskell",
                "JavaScript",
                "Go",
                "Haskell",
                "Haskell",
                "Go"
        );
    }

}
