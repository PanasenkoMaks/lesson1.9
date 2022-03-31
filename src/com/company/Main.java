package com.company;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

    Author authorHarryPotter = new Author("Joanne Kathleen", " Rowling");
    Author authorDune = new Author("Frenk", "Gerbert");
    Book bookOne = new Book("Dune", 1999,authorDune);
    Book bookToo = new Book("Harry Potter", 2006, authorHarryPotter);
    bookOne.setPublicationYear(2022);
        System.out.println(bookOne.toString());
        System.out.println(bookOne.equals(bookToo));
        System.out.println(bookOne.hashCode());



    }
}
