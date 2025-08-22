package com.pharmacy.utils;

import java.util.Random;

public class CodeGenerator {

    public static String generatePrescriptionCode() {
        Random random = new Random();
        int number = 100 + random.nextInt(900); // gives 100 - 999
        return "PR" + number;
    }
}
