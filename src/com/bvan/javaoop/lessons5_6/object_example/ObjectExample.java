package com.bvan.javaoop.lessons5_6.object_example;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(String[] args) {
        PhoneNumber phone1 = new PhoneNumber("+30501111111");
        PhoneNumber phone2 = new PhoneNumber("+30501111111");

        System.out.println(phone1 == phone2); // false

        System.out.println(phone1.equals(phone2)); // true

        Object o = new PhoneNumber("+30501111111");
    }
}

class PhoneNumber extends Object {

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
