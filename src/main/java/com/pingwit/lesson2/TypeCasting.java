package com.pingwit.lesson2;

public class TypeCasting {

    public static void main(String[] args) {
        //automatic
        byte myByte = 120;
        short myShort = myByte;

        byte myByte2 = 120;
        byte myByte3 = 30;
        int sumOfBYtes = myByte2 + myByte3;

        //manual (200 - 256 = -56)
        myShort = 200;
        myByte = (byte) myShort;

        double myDouble = 33.67;
        int myInt = (int) myDouble;
        System.out.println("myInt: " + myInt);


    }
}
