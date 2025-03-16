package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

// This class is responsible for displaying the menu and processing the user's choice
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Calculate cal = new Calculate();

    // This method clears the screen
    public void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // This method displays the menu
    public int showMenu() {
        clearScreen();
        System.out.println("Choose an option:");
        System.out.println("---------------------");
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply");
        System.out.println("[4] Divide");
        System.out.println("[5] Power");
        System.out.println("[6] Square Root");
        System.out.println("[7] Cube Root");
        System.out.println("[8] Exit");
        System.out.println("---------------------");
        System.out.print("Option(No. only): ");

        // This try-catch block ensures that the user enters a number
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear the invalid input
            return showMenu(); // Retry the menu
        }
    }

    // This method processes the user's choice
    public void processOption(int option) {
        // This switch statement processes the user's choice
        switch (option) {

            // This case adds two numbers
            case 1:
                clearScreen();
                System.out.println("Addition");
                System.out.println("---------------------");
                System.out.print("Enter the first number: ");
                float a = scanner.nextFloat();
                System.out.print("Enter the second number: ");
                float b = scanner.nextFloat();
                System.out.println("---------------------");
                cal.add(a, b);
                returnToMenu();

            // this case subtracts twonumbers
            case 2:
                clearScreen();
                System.out.println("Subtraction");
                System.out.println("---------------------");
                System.out.print("Enter the first number: ");
                a = scanner.nextFloat();
                System.out.print("Enter the second number: ");
                b = scanner.nextFloat();
                System.out.println("---------------------");
                cal.subtract(a, b);
                returnToMenu();

            // This case multiplies two numbers
            case 3:
                clearScreen();
                System.out.println("Multiplication");
                System.out.println("---------------------");
                System.out.print("Enter the first number: ");
                a = scanner.nextFloat();
                System.out.print("Enter the second number: ");
                b = scanner.nextFloat();
                System.out.println("---------------------");
                cal.multiply(a, b);
                returnToMenu();

            // This case divides two numbers
            case 4:
                clearScreen();
                System.out.println("Division");
                System.out.println("---------------------");
                System.out.print("Enter the first number: ");
                a = scanner.nextFloat();
                System.out.print("Enter the second number: ");
                b = scanner.nextFloat();
                System.out.println("---------------------");
                cal.divide(a, b);
                returnToMenu();

            // This case calculates the power of a number
            case 5:
                clearScreen();
                System.out.println("Power");
                System.out.println("---------------------");
                System.out.print("Enter the base: ");
                int base = scanner.nextInt();
                System.out.print("Enter the exponent: ");
                int exponent = scanner.nextInt();
                System.out.println("---------------------");
                cal.power(base, exponent);
                returnToMenu();

                // This case calculates the square root of a number
            case 6:
                clearScreen();
                System.out.println("Square Root");
                System.out.println("---------------------");
                System.out.print("Enter the number: ");
                a = scanner.nextFloat();
                System.out.println("---------------------");
                cal.squareRoot(a);
                returnToMenu();

            // This case calculates the cube root of a number
            case 7:
                clearScreen();
                System.out.println("Cube Root");
                System.out.println("---------------------");
                System.out.print("Enter the number: ");
                a = scanner.nextFloat();
                System.out.println("---------------------");
                cal.cubeRoot(a);
                returnToMenu();

            // This case exits the program
            case 8:
                exit();

            // This case handles invalid options
            default:
                System.out.println("Invalid option");
                returnToMenu();
        }
    }

    // This method returns the user to the menu
    public void returnToMenu(){
        try { // This try-catch block ensures that the user returns to the menu
            System.out.println("Press Enter to return to the menu...");
            System.in.read();
            showMenu();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // This method exits the program
    public void exit() {
        try { // This try-catch block ensures that the program exits gracefully
            clearScreen();
            System.out.println("Exiting...");
            Thread.sleep(2000);
            System.exit(0);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
