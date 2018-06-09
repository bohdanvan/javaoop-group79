package com.bvan.javaoop.lessons7_8.generic.box.good;

import com.bvan.javaoop.lessons7_8.generic.box.Cat;
import com.bvan.javaoop.lessons7_8.generic.box.Dog;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<List<String>> namesBox;
        Box<Box<Cat>> catBoxBox;

        Box<Cat> box = new Box<>(new Cat());

        sendBox(box);
    }

    private static void sendBox(Box<Cat> box) {
        Cat cat = box.get();
        cat.meow();
    }
}
