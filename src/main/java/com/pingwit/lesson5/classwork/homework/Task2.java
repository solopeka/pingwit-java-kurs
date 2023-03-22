package com.pingwit.lesson5.classwork.homework;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = (sum + array[i] / array.length);

        }
        System.out.println("Arithmetic mean: " + sum);
    }
}
