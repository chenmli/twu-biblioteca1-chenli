package com.twu.biblioteca;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    static BibliotecaApp bibliotecaApp;
    static ArrayList<Book> expectedList;

    @BeforeClass
    public static void setup()
    {
        bibliotecaApp = new BibliotecaApp();
        expectedList = new ArrayList<Book>();
        expectedList.add(new Book("The Story of Agile1"));
        expectedList.add(new Book("The Story of Agile2"));
        expectedList.add(new Book("The Story of Agile3"));
    }
    @Test
    public void shouldTheBookHaveName()
    {
        Book book = new Book("The Story of Agile1");
        assertEquals(book.getBookName(),bibliotecaApp.getBookList().get(0).getBookName());
    }
    @Test
    public void shouldTheBookListMatchesTheActualApp()
    {
        for(int i = 0;i < expectedList.size();i++)
        {
            assertEquals(expectedList.get(i).getBookName(),bibliotecaApp.getBookList().get(i).getBookName());
        }
    }
    @Test
    public void shouldTheUserSeeTheWelcomeMassage() {
        String expectedMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        assertEquals(expectedMessage,bibliotecaApp.getWelcomeMessage());
    }
}
