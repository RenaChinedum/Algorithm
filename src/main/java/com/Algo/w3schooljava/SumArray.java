package com.Algo.w3schooljava;

public class SumArray {
    public static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
          sum = sum + arr[i];
        }
        return sum;
    }

    public static long sumA(int[] arr){
       int result = 0;
       for(int num : arr){
           result = result * 10 + num;
       }
       return result;
    }

    public static void main(String[] args) {
        int[] num = {1,2,5,2};
        System.out.println(sumA(num));
    }
}
