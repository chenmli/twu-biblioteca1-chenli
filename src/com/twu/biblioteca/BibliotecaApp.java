package com.twu.biblioteca;

public class BibliotecaApp {
    private String welcomeMessage;

    public BibliotecaApp()
    {
        this.welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }



    //getters and setters


    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    //Methods
    public void displayMessage(String message)
    {
        System.out.println(welcomeMessage);
    }
    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.displayMessage(bibliotecaApp.welcomeMessage);
    }
}
