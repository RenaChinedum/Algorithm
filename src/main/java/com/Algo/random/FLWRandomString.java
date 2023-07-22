package com.Algo.random;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class FLWRandomString {
    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "0123456rtyuofnnWERRTGydryfr346666";

    public static String generateUUID(int length) {
        String returnvalue = UUID.randomUUID().toString().replaceAll("-", "");
        return returnvalue;
    }

    public String generateRandomString(int length) {
        StringBuilder returnValue = new StringBuilder(length);

        for (int i = 0; 1 < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }

    public static String generateRef(int length) {

        return generateUUID(length);
    }

    public static void main(String[] args) {
        int len = 12;

//        System.out.println(generateUUID(len));

//        FLWRandomString fs = new FLWRandomString();
//        System.out.println(fs.generateRandomString(len));
        System.out.println(generateRef(len));
    }

}
