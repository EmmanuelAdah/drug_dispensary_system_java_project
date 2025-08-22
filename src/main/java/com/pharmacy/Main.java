package com.pharmacy;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        String choice = input(mainMenu());
        switch (choice){
            case "1":
                print(adminMenu());
                while (true){
                    String username = input("Enter username");
                    String password = input("Enter password");

                    String response = input("Would you like to add another user? (y/n)");
                    if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) break;
                }
            case "2":
                print(doctorMenu());
                break;
            case "3":
                print(pharmacistMenu());
                break;
        }


    }

    public static String mainMenu() {
        return """
                welcome
                press:-
                1 -> Admin
                2 -> Doctor
                3 -> Pharmacist
                4 -> Exit
                """;
    }

    public static String adminMenu(){
        return """
                press:-
                1 -> Add user
                0 -> Back
                """;
    }

    public static String doctorMenu(){
        return """
                press:-
                1 -> Make prescription
                2 -> View prescriptions
                0 -> Back
                """;
    }

   public static String pharmacistMenu(){
        return """
                press:-
                1 -> Check prescription
                2 -> Dispense drugs
                0 -> Back
                """;
   }

    public static void print(String message) {
        System.out.println(message);
    }

    public static String input(String message) {
        print(message);
        Scanner scanner = new Scanner(in);
        return scanner.nextLine();
    }
}