package com.bvan.javaoop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritanceExample {

    public static void main(String[] args) {
        Person p = new Person("Vlad", 20);
        p.sayHello();
        System.out.println("-----");

        Person d = new Developer("Ivan", 40, "Google");
        d.sayHello();
//        d.writeCode();
    }

}

class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Person() {
//        this("unnamed", 0);
//    }

    protected String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }
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
