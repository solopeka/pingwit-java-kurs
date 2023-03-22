package com.pingwit.lesson5.classwork.homework;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int [] array = {0, 1, 2, 3, 4,};
        System.out.println(Arrays.toString(array));

        boolean needToSort = true;

        while(needToSort) {
            needToSort = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i]> array[i-1]) {
                    swap(array, i, i - 1);
                    needToSort = true;
                }
            }
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    private static void swap(int[] array, int currentIndex, int nextIndex) {
        int temp = array[currentIndex];
        array[currentIndex] = array[nextIndex];
        array[nextIndex] = temp;
    }
}


