package com.twu.biblioteca;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibliotecaAppTest {
    static BibliotecaApp bibliotecaApp;
    @BeforeClass
    public static void setup()
    {
        bibliotecaApp = new BibliotecaApp();
    }

    @Test
    public void shouldTheUserSeeTheWelcomeMassage() {
        String expectedMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        assertEquals(expectedMessage,bibliotecaApp.getWelcomeMessage());
    }
}
