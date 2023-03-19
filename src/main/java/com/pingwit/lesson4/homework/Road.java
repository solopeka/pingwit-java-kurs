package com.pingwit.lesson4.homework;

public class Example {
    public static void main(String[] args) {

        int n = 8;
        int k = 0;

        while (k < 2) {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i; j++) {
                    if (i == n - 7 || j == 1) {
                        System.out.print("||  |  ||");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i == 1 || j == i) {
                        System.out.print("||  |  ||");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            k++;
        }
    }
}
