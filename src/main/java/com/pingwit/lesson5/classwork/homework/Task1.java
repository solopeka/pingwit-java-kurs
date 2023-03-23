package com.pingwit.lesson5.classwork.homework;

import java.util.Scanner;

//не оптимально
public class Task1 {

    public static void main(String[] args) {

        //массив надо было заполнить используя Scanner
        int[] array = {10, 25, 50};
        int sum = 0;
        //min = array[0]
        int min = array[0] + 1;
        //max = array[0]. С 0 твой алгоритм на отрицательных числах не сработает
        int max = 0;


        /*
        1. Объявить сканнер 
        1. попросить у пользователя ввести длину массива;
          2. Сделать цикл по это длине и каждый раз просить ввести число и складывать в array.
        */
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
                //Ctrl+Alt+L!
                //это просто в if 
            }else if (array[i] > max) {
                max = array[i];
            }else{
                //зачем тебе этот else?
                System.out.println(0);
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Minimal number: " + min);
        System.out.println("Max number: " + max);
    }
}
