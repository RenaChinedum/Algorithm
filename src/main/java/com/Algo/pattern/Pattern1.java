package com.Algo.pattern;

public class Pattern1 {
    public static void main(String[] args) {
//        pattern(4);
//        pattern1(5);
//        pattern2(4);
//        pattern2copy(4);
//        pattern3(5);
//        pattern4(4);
//        pattern5(5);
//        pattern6(6);
        pattern7(5);
    }


    public static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            //for every row run the columns
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            //after each print, print a new line
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for(int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("<>");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2copy(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            //for every row run the columns
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            //after each print, print a new line
            System.out.println();
        }
    }
    //Pattern 5; pattern is printed from the last value of row;... Study the pattern carefully
    public static void pattern4(int n){
        for (int i = 0; i <2*n; i++) {
           int totalJ = i > n ? 2*n - i : i;
            for (int j = 0; j < totalJ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;

            int noOfSpace = n - totalColInRow;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for (int row = 1; row <= n ; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col= 2; col <= row ; col++) {
                System.out.print(col + " ");

            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int row = 1; row <= 2 * n; row++) {

           int c  = row > n ? 2 * n - row: row;

            for (int space = 0; space < n -c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");

            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n - 1; col++) {
//                int colPrint = r;
            }

        }
    }
}
