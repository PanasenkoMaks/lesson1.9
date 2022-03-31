package com.company;
import java.util.Objects;


public class Author {
    String nameAuthor;
    String surnameAuthor;

public Author (String nameAuthor, String surnameAuthor){
    this.nameAuthor = nameAuthor;
    this.surnameAuthor = surnameAuthor;
}
private String getNameAuthor(){
    return nameAuthor;
}
public String getSurnameAuthor(){
    return surnameAuthor;
}
@Override
    public String toString(){
    return nameAuthor + "," + surnameAuthor;
}
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author str = (Author) other;
        return nameAuthor.equals(str.nameAuthor);

    }
    @Override
    public int hashCode(){
    return Objects.hash (nameAuthor);
    }
}
