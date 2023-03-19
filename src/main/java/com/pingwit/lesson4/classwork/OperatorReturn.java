package com.pingwit.lesson4.classwork;

public class OperatorReturn {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int y = 11;
            if (i == 5) {
                return;
            }

            y++;
            System.out.println(y);
            System.out.println(i);

        }
        System.out.println("After loop");
    }
}
