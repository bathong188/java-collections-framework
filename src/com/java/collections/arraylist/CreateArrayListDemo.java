package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList using the default constructor
        // Initial capacity is ten
        List<String> rocks = new ArrayList<>();

        rocks.add("ruby");
        rocks.add("sapphire");
        rocks.add("diamond");


        // Create an ArrayList from another Collection using
        // ArrayList(Collection c) constructor
        List<Integer> firstFivePrimes = new ArrayList<>();
        firstFivePrimes.add(2);
        firstFivePrimes.add(3);
        firstFivePrimes.add(5);
        firstFivePrimes.add(7);
        firstFivePrimes.add(11);

        List<Integer> firstTenPrimes = new ArrayList<>(firstFivePrimes);
        System.out.println(firstTenPrimes);

        // Add all elements from an existing Collection to an ArrayList
        // using the addAll() method
        List<Integer> secondFivePrimes = new ArrayList<>();
        secondFivePrimes.add(13);
        secondFivePrimes.add(17);
        secondFivePrimes.add(19);
        secondFivePrimes.add(23);
        secondFivePrimes.add(29);

        firstTenPrimes.addAll(secondFivePrimes);
        System.out.println(firstTenPrimes);
    }
}
