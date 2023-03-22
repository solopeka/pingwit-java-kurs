package com.pingwit.lesson5.classwork.homework;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int[] array = {10, 25, 50};
        int sum = 0;
        int min = array[0] + 1;
        int max = 0;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter your 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter your 3rd number: ");
        int num3 = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if(array[i] < min){
                min = array[i];
            }else if (array[i] > max) {
                max = array[i];
            }else{
                System.out.println(0);
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Minimal number: " + min);
        System.out.println("Max number: " + max);
    }
}
