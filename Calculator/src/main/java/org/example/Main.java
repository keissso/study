package org.example;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int option;
        do {
            option = menu.showMenu();
            menu.processOption(option);
        } while (option != 8);
    }
}