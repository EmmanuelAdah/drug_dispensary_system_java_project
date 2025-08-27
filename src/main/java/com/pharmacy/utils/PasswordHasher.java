package com.pharmacy.utils;

import org.mindrot.jbcrypt.BCrypt;
import java.io.*;

public class PasswordHasher {

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    public static boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }

    public static void writeLoginCredentials(String username, String password) {
        Validator.validateUsername(username);
        Validator.validatePassword(password);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Users.txt"))){
            writer.write(String.format("%n%s, %s", username, hashPassword(password)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean readLoginCredentials(String username, String password) {
        try(BufferedReader reader = new BufferedReader(new FileReader("Users.txt"))) {
            String line;
            while ((line  = reader.readLine()) != null ) {
                String[] tokens = line.trim().split(",", 1);
                if (tokens[1].equals(username) && checkPassword(password, tokens[2])) return true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}