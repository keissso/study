package org.example;

// This class is used to display the menu and handle the user's choice
public class Main {
    public static void main(String[] args) throws InterruptedException {
       Menu menu = new Menu();
       do {
           menu.menu();
       }while(true);
    }
}