package com.Algo.recursion;

public class Recursion {
    public static int powerOfTwoRecursion(int n){
        if(n == 0){
            return 1;
        }else {
            var power = 2*powerOfTwoRecursion(n-1);
            return power;
        }
    }

    public static int powerOfTwoIterative(int n){
        int i = 0;
        int power = 1;
        while(i<n){
            power = 2 * power;
            i++;
        }
        return power;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(powerOfTwoRecursion(num));
        System.out.println(powerOfTwoIterative(num));
    }
}
