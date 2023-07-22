package com.Algo;

import java.util.Scanner;

public class ALXAlgorithm {

        public void runningNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt(); // arrays size;

        int[] elements = new int[n];

        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (elements[i] > 0) {
                sum += elements[i];
                System.out.println("all are positive " + sum);
            } else if (elements[i] < 0) {
                System.out.println("negative integer encountered " + sum);
                return;
            }
        }
        sc.close();
    }
//    public int runningNumbers(int[] elements) {
//
//        int sum = 0;
//        for (int i = 0; i < elements.length; i++) {
//            if (i > 0) {
//                sum += i;
//                return sum;
//            } else if (i < 0) {
//                return sum;
//            }
//
//        }
//        return 0;
//    }

    public void runnerSc() {
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



    public static void main(String[] args) {
    int numbers[] = {1,2,3,4};
        ALXAlgorithm alxAlgorithm = new ALXAlgorithm();
        alxAlgorithm.runningNumbers();
//        alxAlgorithm.runnerSc();

    }


}
