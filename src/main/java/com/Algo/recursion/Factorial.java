package com.Algo.recursion;

public class Factorial {

    // Factorial = product of +ve integer < n; this means n! = n*(n-1)*(n-1-1 i.e n-2)*(n-3)*...*2*1)
    // so we have n! = n * (n-1)!
    // We use our three steps in solving it
    // step 1 = the case flow which is = n*(n-1)!
    // Step 2 = the base condition to avoid infinite loop which is n == 0 || 1 since both are = 1;
    // Step 3 = Unintended case i.e. criterion in-case of a non-positive number
    // (just check for any condition stated in the question or would result error)
    public int factorial(int n){
        if(n < 0){
            return -1;
        }
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
          Factorial factorial = new Factorial();
        int num = 5;
        System.out.println(factorial.factorial(num));
    }
}
