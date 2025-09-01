package com.pharmacy;

import com.pharmacy.controller.DoctorServicesController;
import com.pharmacy.data.models.Drug;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String... args) {

        String choice = input(mainMenu() + "Enter option: ");
        switch (choice){
            case "1": adminService();
            case "2":
                print(doctorMenu());
                String doctorsChoice = input("Enter option: ");
                switch (doctorsChoice){
                    case "1": {
                        DoctorServicesController controller = new  DoctorServicesController();
                        AddPrescriptionRequest request = new AddPrescriptionRequest();

                        String username = input("Enter username");
                        String password = input("Enter password");
                        try {
                                    request.setPatientID(Integer.parseInt(input("Enter Patient ID: ")));
                                    request.setDiagnosis(input("Enter Diagnosis: "));
                                    List<Drug> drugs = new ArrayList<>();
                                    while (true) {
                                        Drug drug = new Drug();
                                        drug.setName(input("Enter drug Name: "));
                                        drug.setDosage(input("Enter Dosage: "));
                                        drug.setQuantity(Integer.parseInt(input("Enter Quantity: ")));
                                        drugs.add(drug);
                                        String addDrugChoice = input("Would you like to drugs? \nPress 1-> Yes or 2-> No");
                                        if (!Objects.equals(addDrugChoice, "yes")) break;
                                    }
                                    request.setDrugs(drugs);
                                }catch (NumberFormatException e){
                                    System.err.print(e.getMessage());
                                }
                                controller.recordNewPrescription(request);
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
                0 -> Logout
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

   public static void adminService(){
       while (true){
           String username = input("Enter username");
           String password = input("Enter password");

           String response = input("Would you like to add another user? (y/n)");
           switch (response){
               case "yes", "y": continue;
               default: main();
           }
       }
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