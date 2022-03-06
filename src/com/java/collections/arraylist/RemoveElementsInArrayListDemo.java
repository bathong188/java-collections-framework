package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsInArrayListDemo {
    public static void main(String[] args) {
        // Remove a specific element from ArrayList
        // by using the remove() method
        List<String> pets = new ArrayList<>();

        pets.add("dog");        // 0
        pets.add("cat");        // 1
        pets.add("guinea pig"); // 2
        pets.add("parrot");     // 3
        pets.add("capybara");   // 4
        pets.add("fish");       // 5
        pets.add("chicken");    // 6
        System.out.println(pets);

        // Remove an element by passing an index
        System.out.println("Removed pet at index 0: " + pets.remove(0)
                + "\n" + pets);

        // Remove an element by passing an Object
        System.out.println("Removed parrot from ArrayList? "
                + pets.remove("parrot") + "\n" + pets);


        // Remove all elements that exist in a given Collection
        // by using the removeAll() method
        List<String> toBePutDown = new ArrayList<>();
        toBePutDown.add("cat");
        toBePutDown.add("chicken");

        pets.removeAll(toBePutDown);
        System.out.println(pets);


        // clear() method
        pets.clear();
        System.out.println(pets);
    }
}
