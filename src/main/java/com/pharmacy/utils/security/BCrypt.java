package com.pharmacy.utils.security;

public class BCrypt {

        public static String hashPassword(String password) {
            return com.pharmacy.utils.security.BCrypt.hashpw(password, com.pharmacy.utils.security.BCrypt.gensalt(12));
        }

}
