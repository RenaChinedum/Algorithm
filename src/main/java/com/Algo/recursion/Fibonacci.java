package com.Algo.recursion;

public class Fibonacci {
    //Fibonacci are sequence of numbers which each number is a sum of two preceding numbers and usually start from 0 and 1
    // Example = 0,1,1,2,3,5,8,13,21,34,55,89 etc
    // Step 1 = Case Flow == using 5 for example 5 = 3 + 2 = first previous/preceding + 2nd preceding
    // we can say 5 = (5-1st preceding) + (5 - 2nd preceding) the flow becomes (5-1 + 5 - 2) take 1 & 2 for positions
    // final flow = f(n) = f(n-1) + f(n-2)

    public int fibonacci(int n) {
        if (n < 0) { // Step 3 = Constraint
            return -1;
        }
        if (n == 0 || n == 1) {
            return n; // Step 2 = Base Condition ( fibonacci of 0 and 1 are = themselves
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int num = 4;
        System.out.println(fib.fibonacci(num));
    }
}
