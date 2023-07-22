package com.Algo.package1;

import java.util.Arrays;

public class NumericToOrdinal {
    public static String NumberToOrdinal(int number){
        String[] suffix = {"th","st","nd","rd"} ;
        int rem = number % 10;
        if(number == 0){
            return "0";
        } else if(number >= 11 && number < 14){
           return number + suffix[0];
        } else if (rem < suffix.length) {
            return number + suffix[rem];

        }else {
            return number + suffix[0];
        }
    }

    public static String[] arrayOfNumberToOrdinal(int[] numbers){
        String[] suffix = {"th","st","nd","rd"} ;
        String[] result = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            int rem = numbers[i] % 10;
            if(numbers[i] == 0){
                result[i] = "0";
            } else if(numbers[i] >= 11 && numbers[i] < 14){
                result[i] = numbers[i] + suffix[0];
            } else if (rem < suffix.length) {
                result[i] = numbers[i] + suffix[rem];
            }else {
               result[i] = numbers[i] + suffix[0];
            }
        }
        return result;
    }

    public static void main(String[] args) {
       int result = 31;
        System.out.println(NumberToOrdinal(result));

        int[] arr = {3,21,12,10};
        System.out.println(Arrays.toString(arrayOfNumberToOrdinal(arr)));
    }

}
