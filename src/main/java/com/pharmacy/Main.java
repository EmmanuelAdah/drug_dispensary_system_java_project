package com.pharmacy;

import java.util.Scanner;

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
                String pharmacistLoginMenu = """
                        1. View doctor prescription
                        2. Dispense prescription
                        3. View dispensed prescriptions
                        4. Logout
                        """;
                System.out.println(pharmacistLoginMenu);
            case "3":


        }

    }
}