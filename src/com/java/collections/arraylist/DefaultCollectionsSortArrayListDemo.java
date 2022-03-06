package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefaultCollectionsSortArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(42);
        list.add(12);
        list.add(65);
        list.add(82);
        list.add(37);
        list.add(72);

        // Sort in ascending order
        Collections.sort(list);
        System.out.println(list);

        // Sort in descending order
        Collections.reverse(list);
        System.out.println(list);
    }
}
