package com.pingwit.lesson2;

public class DayOfWeek {
    public static void main(String[] args) {

        int x = 3;
        String day;

        switch (x) {

            case 1 -> day = "Monday";
            case 2 -> day = "Tuesday";
            case 3 -> day = "Wednesday";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            case 6 -> day = "Saturday";
            case 7 -> day = "Sunday";
            default -> day = "500 server error";
        }
        System.out.println(day);
    }
}
