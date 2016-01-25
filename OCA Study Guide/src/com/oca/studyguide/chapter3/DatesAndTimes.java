package com.oca.studyguide.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DatesAndTimes {

    public static void main(String[] args) {

        // 3 types of Dates and Times
        //
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        // LocalDate creation
        //
        LocalDate date1 = LocalDate.of(2015, Month.DECEMBER, 20);
        LocalDate date2 = LocalDate.of(2015, 12, 21);

        System.out.println(date1);
        System.out.println(date2);

        // LocalTime creation
        //
        LocalTime time1 = LocalTime.of(13, 15); // hour and minutes
        LocalTime time2 = LocalTime.of(6, 45, 59);
        LocalTime time3 = LocalTime.of(12, 34, 55, 999999999);

        LocalDateTime dateTime1 = LocalDateTime.of(date1, time3);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        System.out.println(dateTime1);

        //
        // Date manipulation
        System.out.println("--------------------");
        System.out.println("Date Manipulation");
        System.out.println("--------------------");

        LocalDate date = LocalDate.of(2014, Month.FEBRUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(3);
        System.out.println(date);
        date = date.plusMonths(4);
        System.out.println(date);
        date = date.plusYears(4);
        System.out.println(date);
    }
}