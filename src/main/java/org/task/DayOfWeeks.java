package org.task;

public enum DayOfWeeks {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Weekend", 6),
    SUNDAY("Weekend", 7);

    private final String weekdayNormal;
    private final int dayNum;

    DayOfWeeks(String weekdayNormal, int dayNum){
        this.weekdayNormal = weekdayNormal;
        this.dayNum = dayNum;
    }

    public String getWeekdayNormal() {
        return weekdayNormal;
    }
}
