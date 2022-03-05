package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // List allows to add duplicate elements
        list.add("bru1");   // 0
        list.add("bru1");   // 1
        list.add("bru2");   // 2
        list.add("bru2");   // 3

        // List allows to add NULL elements
        list.add(null);     // 4

        // List maintains insertion order
        System.out.println(list);

        // We can access elements of List using index
        System.out.println(list.get(2));

    }
}
