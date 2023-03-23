package com.pingwit.lesson5.classwork.homework;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[][] twoDimArray = new int[9][10];//а если я хочу сама решать, какой размерности таблицу мне надо? (СКАННЕР!)
        //А если бы я сказала создать 100x100? Инициализация только в цикле!      
        twoDimArray[0][0] = 0;
        twoDimArray[0][1] = 1;
        twoDimArray[0][2] = 2;
        twoDimArray[0][3] = 3;
        twoDimArray[0][4] = 4;
        twoDimArray[0][5] = 5;
        twoDimArray[0][6] = 6;
        twoDimArray[0][7] = 7;
        twoDimArray[0][8] = 8;
        twoDimArray[0][9] = 9;

        twoDimArray[1][0] = 2;
        twoDimArray[2][0] = 3;
        twoDimArray[3][0] = 4;
        twoDimArray[4][0] = 5;
        twoDimArray[5][0] = 6;
        twoDimArray[6][0] = 7;
        twoDimArray[7][0] = 8;
        twoDimArray[8][0] = 9;

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (i + 1) * (j + 1);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
