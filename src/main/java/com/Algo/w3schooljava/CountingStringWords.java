package com.Algo.w3schooljava;

public class CountingStringWords {
    public static int countWords(String words){
        return words.split("\\s").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("my name is Rena Chinedum Victor from Abakaliki Ebonyi State"));
    }
}
