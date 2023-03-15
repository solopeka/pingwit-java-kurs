package com.pingwit.lesson3.homework;

import com.sun.source.doctree.SummaryTree;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        /*
        Task 1
        Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней?
         */
        System.out.println("Task 1: ");

        double totalKm, today;
        totalKm = today = 10;

        for (int i = 2; i <= 7; i++) {
            today = today + (today * 0.1);
            totalKm += today;
        }
        System.out.println(totalKm);

        System.out.println("====");

        /*
        Task 2
        Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
         */

        System.out.println("Task 2: ");

        int ameba = 1;
        int numOfHours = 24;
        for (int i = 0; i <= 24; i += 3 ) {
            ameba = ameba * 2;
        }
        System.out.println(ameba);

        System.out.println("====");

        /*
        Task 3
        Вычислить: 1+2+4+8+...+256
         */

        System.out.println("Task 3: ");

        int sumOfNumbers = 0;
        int finalOfNumber = 256;

        for (int i = 1; i <= 256; i *= 2) {
            sumOfNumbers += i;
        }
        System.out.println(sumOfNumbers);

        System.out.println("====");

        /*
        Task 4
        Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
         */

        System.out.println("Task 4: ");

        int a = 6;
        int b = 8;
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            sum = sum + b;
        }
        System.out.println(sum);

        System.out.println("====");

        /*
        Task 5
        Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
        для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
         */

        System.out.println("Task 5: ");

        double x = 2.54;
        int n = 0;

        for (int i = 1; i <= 20; i++) {
            double y = i * x;
            int z = i + n;

            System.out.println(z + " = " + y);
        }

        System.out.println("====");

        /*
        Task 6
        Напишите программу вывода всех четных чисел от 2 до 100 включительно
         */

        System.out.println("Task 6: ");

        int numOfEven = 2;

        for (int i = 2; i <= 100; i += 2) {
            if (numOfEven % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println(0);
            }
        }

        System.out.println("====");

        /*
        Task 7
        Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
         */

        System.out.println("Task 7: ");

        int numOfOddNumber = 0;

        for (int i = 1; i <= 99; i += 2) {
            numOfOddNumber += i;
        }
        System.out.println(numOfOddNumber);

        System.out.println("====");

        /*
        Task 8
        Даны числа от 0 до 100.
        - Посчитать сумму четных и вывести на экран
        - Посчитать сумму нечетных и вывести на экран
        - Найти общую сумму всех чисел
         */

        System.out.println("Task 8: ");

        int sumOfEven = 0;
        int sumOfOddNumber = 0;

        for(int i = 0; i <= 100; i += 2) {
            sumOfEven += i;

        }

        for (int j = 1; j <= 100; j += 2) {
            sumOfOddNumber += j;
        }
        System.out.println(sumOfEven);
        System.out.println(sumOfOddNumber);
        System.out.println(sumOfEven+sumOfOddNumber);

        System.out.println("====");

        /*
        Task 9
        Нарисуйте оставшиеся 2 треугольника.
        Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
           *  (1)
          **
         ***
        ****

        ****  (2)
         ***
          **
           *
         */

        System.out.println("Task 9: ");

        int num = 4;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }













    }
}
