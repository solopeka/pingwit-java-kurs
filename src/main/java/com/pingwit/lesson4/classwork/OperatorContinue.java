package com.pingwit.lesson4.classwork;

public class OperatorContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
        System.out.println("After loop");
    }
}
