package com.Algo.w3schooljava;

public class ReverseString {
    public static String reverse(String str){
        String reversedStr = "";
        for (int i = 0; i <str.length() ; i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
