package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    private String welcomeMessage;
    private ArrayList<Book> bookList;

    public BibliotecaApp()
    {
        this.welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        this.bookList = new ArrayList<Book>();
        this.bookList.add(new Book("The Story of Agile1"));
        this.bookList.add(new Book("The Story of Agile2"));
        this.bookList.add(new Book("The Story of Agile3"));
    }



    //getters and setters


    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    //Methods
    public void displayMessage(String message)
    {
        System.out.println(welcomeMessage);
    }
    public void displayBookList(List<Book> bookList)
    {
        for(Book book : bookList)
            System.out.println(book.toString());
    }
    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.displayMessage(bibliotecaApp.welcomeMessage);
    }
}
