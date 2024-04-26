package org.example;

import java.util.Arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {
        //Create array of books
        Book [] books = new Book[3];

        Book b = new Book("Python", 1, 200);
        books[1] = new Book("Java", 2, 100);
        books[2] = new Book("C++", 3, 250);
        books[0] = b;

        //will display the address of books
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, (b1,b2)-> b1.price - b2.price);
        System.out.println(Arrays.toString(books));

    }
}
