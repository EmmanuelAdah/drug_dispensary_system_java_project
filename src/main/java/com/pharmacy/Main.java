package com.pharmacy;

import com.pharmacy.dtos.request.AddPrescriptionRequest;

import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String... args) {

        String choice = input(mainMenu() + "Enter option: ");
        switch (choice){
            case "1":
                while (true){
                    String username = input("Enter username");
                    String password = input("Enter password");

                    String response = input("Would you like to add another user? (y/n)");
                    switch (response){
                        case "yes", "y": continue;
                        default: main();
                    }
                }
            case "2":
                print(doctorMenu());
                String doctorsChoice = input("Enter option: ");
                switch (doctorsChoice){
                    case "1": {


                    }
                    case "2":{

                    }
                }
                break;
            case "3":
                print(pharmacistMenu());
                break;

            case "4": print("Good bye..."); System.exit(12);
        }

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

   public static AddPrescriptionRequest makePrescription(){
        AddPrescriptionRequest request = new AddPrescriptionRequest();
        while (true){
            request.setPatientID(Integer.parseInt(input("Enter patient ID: ")));

        }

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