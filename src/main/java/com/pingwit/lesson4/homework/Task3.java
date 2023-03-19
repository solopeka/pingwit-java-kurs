package com.pingwit.lesson4.homework;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        Task 3
        Вычислить: Random Sum;
         */
        /*int min = 0;
        int max = 10;
        int sum = 0;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter min number: ");
        int min = scanner.nextInt();

        System.out.println("Enter max number: ");
        int max = scanner.nextInt();
        int sum = 0;
        while (min <= max) {
            sum = sum + min;
            min++;
        }
        System.out.println(sum);



    }
}
