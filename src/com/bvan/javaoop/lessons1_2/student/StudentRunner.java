package com.bvan.javaoop.lessons1_2.student;

/**
 * @author bvanchuhov
 */
public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Ivaniv");
        student.setEmail("taras@gmail.com");
        student.setLevel(1);

        System.out.println(student);
    }
}
