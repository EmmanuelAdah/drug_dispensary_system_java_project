package com.pharmacy;

import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String menu = """
                Welcome to SM Pharmacy.
                1. Login as Doctor
                2. Login as Pharmacist
                3. Exit
                """;
        System.out.println(menu);
        String selectMenu = input.nextLine();

        switch (selectMenu) {
            case "1":
                String doctorLoginMenu = """
                        1. Make prescription
                        2. View prescriptions
                        3. Logout
                        """;
                System.out.println(doctorLoginMenu);
            case "2":

        }

        String choice = input(mainMenu());

    }

    public static String mainMenu() {
        return """
                welcome to SM Pharmacy
                press:-
                1 -> Admin
                2 -> Doctor
                3 -> Pharmacist
                4 -> Exit
                """;
    }

    public static String doctorMenu(){
        return """
                press:-
                1 -> Make prescription
                2 -> View prescriptions
                3 -> Logout
                0 -> Back
                """;
    }

   public static String pharmacistMenu(){
        return """
                press:-
                1 -> Check prescription
                2 -> Dispense drugs
                3 -> View dispensed prescriptions
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