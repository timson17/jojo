package ru.jde.jde.hashgen;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {

    public String hashing (String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] encodedBytes = digest.digest(password.getBytes());

            // Преобразуем байтовый массив в строку шестнадцатеричного представления
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
