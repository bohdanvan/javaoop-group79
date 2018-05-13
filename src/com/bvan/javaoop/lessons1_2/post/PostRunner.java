package com.bvan.javaoop.lessons1_2.post;

/**
 * @author bvanchuhov
 */
public class PostRunner {

    public static void main(String[] args) {
        Post p1 = new Post("elonmusk", "Rocket!!!", 4000);
        Post p2 = new Post("durov", "Telegram...", 2000);

        Post p3 = new Post("elonmusk", "AI !!!");

        p1.like();
        p1.addComment("Super!");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
