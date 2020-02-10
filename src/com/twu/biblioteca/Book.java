package com.twu.biblioteca;

public class Book {
    private String bookName;

    public Book()
    {

    }
    public Book(String bookName)
    {
        this.bookName = bookName;
    }

    //Getter and Setter

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public String toString()
    {
        return bookName;
    }
}
