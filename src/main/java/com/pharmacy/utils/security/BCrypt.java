package com.pharmacy.utils.security;

public class BCrypt {

        public static String hashPassword(String password) {
            return BCrypt.hashpw(password, com.pharmacy.utils.security.BCrypt.gensalt(12));
        }

}
