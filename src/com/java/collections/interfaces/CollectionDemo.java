package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();

        // add operation from Collection interface
        fruitCollection.add("apple");
        fruitCollection.add("banana");
        fruitCollection.add("durian");
        System.out.println(fruitCollection);

        // remove operation from Collection interface
        fruitCollection.remove("durian");
        System.out.println(fruitCollection);

        // foreach from the Iterable interface
        fruitCollection.forEach((elem) -> {
            System.out.println(elem);
        });

        // clear from Collection interface
        fruitCollection.clear();
        System.out.println(fruitCollection);
    }
}
