package com.bvan.javaoop.lessons5_6.abstract_class;

/**
 * @author bvanchuhov
 */
public class AbstractClassExample {

    public static void main(String[] args) {
        Person d = new Developer("Ivan", 40, "Google");
        d.sayHello();
//        d.writeCode();
    }

}

abstract class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    public abstract void sayHello();
}

class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void writeCode() {
        System.out.println("I'm writing code in " + company);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi, I'm " + getName() + " from " + company);
    }
}
