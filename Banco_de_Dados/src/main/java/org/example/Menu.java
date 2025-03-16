package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Thread.sleep;

// This class is used to display the menu and handle the user's choice
public class Menu {
    Scanner scan = new Scanner(System.in);
    Banco banco = new Banco();
    Map<String, String> Bank = new HashMap<>();

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // This method displays the menu
   public void menu() throws InterruptedException {
        clearScreen();
       System.out.println("DATA BASE");
       System.out.println("---------------------");
       System.out.println("[1](DATA)");
       System.out.println("[2](INSERT DATA)");
       System.out.println("[3](UPDATE DATA)");
       System.out.println("[4](DELETE DATA)");
       System.out.println("[5](EXIT)");
       System.out.println("---------------------");
       System.out.print(">>TYPE YOUR CHOICE(No. only): ");
       int choice = scan.nextInt();

       choicesOP(choice);
   }

   // This method handles the user's choice
   public void choicesOP(Integer choice) throws InterruptedException {
       switch (choice) {
           case 1 -> showData();
           case 2 -> insertData();
           case 3 -> updateData();
           case 4 -> deleteData();
           case 5 -> exitMenu();
           default -> {
                System.out.println("Invalid choice");
                pressAnyKeyToContinue();
           }
       }

   }

   // This method displays the data
   public void showData() {
        clearScreen();
       System.out.println("data");
       System.out.println("---------------------");
       Bank.forEach((key, value) -> System.out.println("Key| "+ key +" |Value| "+ value));
       System.out.println("---------------------");
       pressAnyKeyToContinue();
   }

    // This method updates the data
   public void updateData() {
        clearScreen();
       System.out.println("DATA UPDATE");
       System.out.println("---------------------");
       Bank.forEach((key, value) -> System.out.println("Key| "+ key +" |Value| "+ value));
       System.out.println("---------------------");
       System.out.print(">>DATA KEY TO UPDATE: ");
       String inputKey = scan.next();
       System.out.print(">>NEW DATA: ");
       String inputData = scan.next();

       // Check if the key exists
       if(Bank.containsKey(inputKey)){
           Bank.put(inputKey, inputData);
         }else {
           System.out.println("Key not found");
       }
       clearScreen();
       pressAnyKeyToContinue();
   }

   // This method inserts the data
   public void insertData() {
       clearScreen();
       System.out.println("DATA INSERTION");
       System.out.println("---------------------");
       System.out.print(">>Data to insert: ");
       String inputData = scan.next();
       System.out.print(">>DATA KEY: ");
       String inputKey = scan.next();

       banco.setKey(inputKey);
       banco.setInput(inputData);
       Bank.put(banco.getKey(), banco.getInput());
       clearScreen();
       pressAnyKeyToContinue();
   }

    // This method deletes the data
   public void deleteData() {
       System.out.println("DATA DELETE");
       System.out.println("---------------------");
       Bank.forEach((key, value) -> System.out.println("Key| "+ key +" |Value| "+ value));
       System.out.println("---------------------");
       System.out.print(">>DATA KEY TO DELETE: ");
       String inputKey = scan.next();
       Bank.remove(inputKey);
       clearScreen();
       pressAnyKeyToContinue();
   }

    // This method is used to pause the program
   public void pressAnyKeyToContinue() {
       System.out.println("Press any key to continue...");
       try {
           System.in.read();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   // This method is used to exit the program
   public void exitMenu() throws InterruptedException {
        clearScreen();
       System.out.println("EXITING....");
       sleep(2000);
       System.exit(0);
   }
}
