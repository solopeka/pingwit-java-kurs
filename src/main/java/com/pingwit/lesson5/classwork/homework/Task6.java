package com.pingwit.lesson5.classwork.homework;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenNums = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[index] = array1[i];
                index++;
            }
        }
        System.out.println("Result: " + Arrays.toString(array2));
    }
}
