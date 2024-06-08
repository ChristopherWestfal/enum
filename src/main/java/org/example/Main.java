package org.example;

public class Main {
    public static void main(String[] args) {
        Weekday today = Weekday.FRIDAY;
        System.out.println(today.getWeekdayNormal());
        System.out.println(today.getDayNum());
    }
}