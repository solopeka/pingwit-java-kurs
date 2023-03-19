package com.pingwit.lesson4.homework;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        /*
        Task 2
        Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
         */

        int k = 1;
        int ameba = 1;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number: ");
        int max = scanner.nextInt();
        while (k <= max) {
            ameba *= 2;

            System.out.println(ameba);
            k += 3;
        }
    }
}
