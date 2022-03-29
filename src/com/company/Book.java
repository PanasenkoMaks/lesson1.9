package com.company;

public class Book {
    String nameBook;
    int publicationYear;

    public Book (String nameBook, int publicationYear){
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;
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
}
