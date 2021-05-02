package com.code;

public class Main {

    public static void main(String[] args) {

        WeekDays allValues[]=WeekDays.values();

        for(WeekDays value:allValues){

            System.out.printf("%d - %s\n",value.ordinal(),value);
        }

        WeekDays day1=WeekDays.FRIDAY;
        WeekDays day2=WeekDays.valueOf("FRIDAY");

        System.out.println(day1==WeekDays.FRIDAY);
        System.out.println(day1.equals(WeekDays.FRIDAY));
        System.out.println(day1==day2);
    }
}
