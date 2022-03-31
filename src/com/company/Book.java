package com.company;
import java.util.Objects;

import java.util.concurrent.atomic.AtomicBoolean;

public class Book {
    String nameBook;
    int publicationYear;
    Author author;


    public Book (String nameBook, int publicationYear, Author author){
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;
        this.author = author;


    }
    public String getNameBook(){
        return nameBook;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear (int publicationYear){
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString(){
        return nameBook + "," + publicationYear + "," + author;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book str = (Book) other;
        return nameBook.equals(str.nameBook);
    }
    @Override
    public int hashCode (){
        return Objects.hash(nameBook);
    }
}
