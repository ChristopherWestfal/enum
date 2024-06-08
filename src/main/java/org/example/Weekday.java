package org.example;

public enum Weekday {

    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String weekdayNormal;
    private final int dayNum;

    Weekday(String weekdayNormal, int dayNum) {
        this.weekdayNormal = weekdayNormal;
        this.dayNum = dayNum;
    }

    public String getWeekdayNormal() {
        return weekdayNormal;
    }

    public int getDayNum() {
        return dayNum;
    }
}
