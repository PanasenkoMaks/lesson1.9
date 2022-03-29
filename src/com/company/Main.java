package com.company;

public class Main {

    public static void main(String[] args) {
	Book bookOne = new Book("Dune", 1999);
    Book bookToo = new Book("Harry Potter", 2006);
    Author authorHarryPotter = new Author("Joanne Kathleen", " Rowling");
    Author autorDune = new Author("Frenk", "Gerbert");
        System.out.println("bookToo.nameBook = " + bookToo.nameBook);
        bookOne.publicationYear = 1995;
        System.out.println("bookOne.getPublicationYear() = " + bookOne.getPublicationYear());
    }
}
