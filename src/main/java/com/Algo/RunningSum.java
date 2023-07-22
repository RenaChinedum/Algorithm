package com.Algo;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        while (number >= 0) {
            sum += number;
            System.out.println("Enter the next number:");
            number = scanner.nextInt();
        }

        System.out.println("Final result: " + sum);

        scanner.close();
    }
}
