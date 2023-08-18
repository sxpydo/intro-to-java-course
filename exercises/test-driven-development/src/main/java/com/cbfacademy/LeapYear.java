package com.cbfacademy;

public class LeapYear {
    private final Integer year;

    public LeapYear(Integer year) {
        this.year = year;
    }

    public Boolean isLeapYear() {
        if (this.year % 400 == 0) return true;
        if (this.year % 100 == 0) return false;
        return(this.year % 4 == 0);
    }

}