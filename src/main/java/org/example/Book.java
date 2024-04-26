package org.example;

public class Book {
    int isbn;
    String name;
    int price;

    public Book(String name, int isbn, int price) {
        this.name = name;
        this.price = price;
        this.isbn = isbn;
    }

    //we override the original toString method
    @Override
    public String toString() {
        return "Book{"+
                "isbn=" + isbn +
                ", name=' " + name + '\'' +
                ", price=" + price +
                        '}';
    }

}
