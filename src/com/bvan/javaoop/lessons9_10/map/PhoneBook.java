package com.bvan.javaoop.lessons9_10.map;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class PhoneBook {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new TreeMap<>();

        // HashMap - random
        // LinkedHashMap - original order
        // TreeMap - sorted order by keys

        phoneBook.put("Masha", new PhoneNumber("+30501112244"));
        phoneBook.put("Boris", new PhoneNumber("+30501112233")); // O(1)
        phoneBook.put("Anton", new PhoneNumber("+30501112255"));
        phoneBook.put("Serhey", null); // BAD PRACTICE

        System.out.println(phoneBook.containsKey("Serhey"));

        phoneBook.put("Masha", new PhoneNumber("+30501112200"));

        PhoneNumber phone = phoneBook.get("Masha"); // O(1)
        System.out.println(phone);
        System.out.println();

        Set<String> keys = phoneBook.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println();

        Collection<PhoneNumber> values = phoneBook.values();
        for (PhoneNumber value : values) {
            System.out.println(value);
        }
        System.out.println();

        Set<Map.Entry<String, PhoneNumber>> entries = phoneBook.entrySet();
        for (Map.Entry<String, PhoneNumber> entry : entries) {
            String name = entry.getKey();
            PhoneNumber phoneNumber = entry.getValue();
            System.out.println(name + " -> " + phoneNumber);
        }
    }
}

class PhoneNumber {

    private final String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
