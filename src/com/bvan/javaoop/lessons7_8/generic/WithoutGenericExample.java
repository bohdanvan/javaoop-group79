package com.bvan.javaoop.lessons7_8.generic;

import com.bvan.javaoop.lessons1_2.post.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WithoutGenericExample {

    public static void main(String[] args) {
        List names = new ArrayList(); // BAD STYLE. <...> was missed

        names.add("Taras");
        names.add(10);
        names.add(new Post("a", "b"));

        System.out.println(names);
    }
}
