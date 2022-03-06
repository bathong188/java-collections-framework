package com.java.collections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InterateThroughArrayListDemo {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");

        // Basic for loop
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }

        // Enhanced for loop
        for (String course : courses) {
            System.out.println(course);
        }

        // Iterator with basic for loop
        for (Iterator iterator = courses.iterator(); iterator.hasNext(); ) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        // Iterator with while loop
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        // Java 8 stream + lambda
        courses.stream().forEach(course -> System.out.println(course));

        // Java 8 forEach + lambda
        courses.forEach(course -> System.out.println(course));
    }
}
