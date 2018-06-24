package com.bvan.javaoop.lessons11_12.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class NamesIO {

    public static void main(String[] args) {
        String fileName = "files/names.txt";

        // text input stream from file
        try {
            List<String> names = readNamesFromFile(fileName);
            System.out.println(names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readNamesFromFile(String fileName) throws IOException {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
            return readNames(reader);
        }
    }

    public static List<String> readNames(BufferedReader reader) throws IOException {
        List<String> names = new ArrayList<>();
        String name = reader.readLine();
        while (name != null) {
            names.add(name);
            name = reader.readLine();
        }
        return names;
    }
}
