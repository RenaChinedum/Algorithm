package com.Algo.recursion;

public class ReQaA {
    //This class has questions from cracking the coding interview questions and answers on recursion
    // the ReQaA = Recursion Questions and Answers

    //Question 1 = find sum of digits of a positive number using recursion

    public int sumOfDigits(int n){
        //Step 1. the flow = f(n) = n%10 + f(n/10)... this means that we get the integer from division and the remainder from
        // modulus this split the digits into individual number which we can sum to get the sum of the numbers in the digit.
        //int the case of numbers above 99 the recursive call keeps getting the numbers reduced until the base condition is met
        if(n < 1){
            return -1;
        }
        if(n < 10){
            return n;
        }
        return n % 10 + sumOfDigits(n/10);
    }

    //Question 2 Calculate the power of a number using recursion
    public int powerOfNumbers(int base, int expo){
        //Step1 the flow = Here we use indices since 2^4 == 2*2*2*2 and X^2*X^3 => X^2+3 => X^5 => X*X^5-1 eg 2^4 = 16 2*2^4-1 => 2*2^3 =16
        // the flow becomes X^n = X*X^n-1

        if(expo < 0){
            return 1;
        }
        if (expo == 1 || expo == 0){
            return base;
        }
        return base * powerOfNumbers(base,expo-1);
    }

    //Question 3 Find the GCD of numbers using recursion

    public int gcd(int a, int b){

        // the Flow => here we use Euclidean algorithm... which states that in gcd(a,b) if b = 0 gcd(a,b) = a
        // else gcd(a,b) = gcd(b, a % b) => the value of b where a % b = 0 is the gcd example if we have 48,18 a = 48, b = 18
        // then a%b = 12 but a%b != 0, we call again now a = 18, b = 12 a%b = 6 which is != 0, so we call again
        // now a = 12, b = 6 a%b =0  then we check again a = 6, b = 0 then our call is ended therefore at b = 6 our a%b = 0.. 6 = gcd.

        if(a < 0 || b < 0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    //Question 4
    public int numberToBinary(int n){
        if(n == 0){
            return 0;
        }
        return n % 2 + 10 * numberToBinary(n/2);
    }

    public static void main(String[] args) {
       ReQaA reQaA = new ReQaA();
       int num = 10;
        System.out.println(reQaA.numberToBinary(num));
    }
}
