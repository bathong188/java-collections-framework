package com.java.collections;

public class PurposeOfCollection {
    public static void main(String[] args) {
        // Storing n number of integers
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        // int n = n*10;

        // Arrays are good for storing many elements
        int[] intArr = new int[1000];

        // Limitations:
        // 1. arrays are fixed in size
        // 2. can hold only one data type at a time

        // Example of Student array
        Student[] studentArr = new Student[10];
        studentArr[0] = new Student();
        studentArr[1] = new Student();
        // studentArr[2] = new Book();   // type mismatch

        // Object is a superclass of all classes
        // so the array can store various object types
        Object[] objectArr = new Object[10];
        objectArr[0] = new Student();
        objectArr[1] = new Book();

        // 3. but existing APIs support is not available for array
    }
}

class Student {
    String name;
    int redID;
}

class Book {
    String title;
    int isbn;
}