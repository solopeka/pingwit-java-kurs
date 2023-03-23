package com.pingwit.lesson5.classwork.homework;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        //пользуемся всегда сканнером или изучаем рандом
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                array[i] = 0;
            }
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
