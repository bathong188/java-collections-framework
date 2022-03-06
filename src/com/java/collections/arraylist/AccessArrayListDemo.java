package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessArrayListDemo {
    public static void main(String[] args) {
        // Check if an ArrayList is empty using the isEmpty() method
        List<String> topProgLanguages = new ArrayList<>();

        System.out.println("topProgLanguages empty? "
                + topProgLanguages.isEmpty());

        topProgLanguages.add("C");
        topProgLanguages.add("Java");
        topProgLanguages.add("C++");
        topProgLanguages.add("Python");
        topProgLanguages.add(".NET");

        System.out.println("topProgLanguages empty? "
                + topProgLanguages.isEmpty());

        // Find the size of an ArrayList using the size() method
        System.out.println("Here are the top " + topProgLanguages.size()
                + " programming languages in the world "
                + topProgLanguages);

        // Access the element at a particular index of an ArrayList
        // using the get() method
        String bestLanguage = topProgLanguages.get(1);
        System.out.println("The best language is " + bestLanguage);

        // Modify the element at a particular index of an ArrayList
        // using the set() method
        topProgLanguages.set(4, "C#");
        System.out.println(topProgLanguages);
    }
}
