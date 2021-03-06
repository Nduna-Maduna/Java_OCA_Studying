package com.oca.studyguide.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExamples {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime localTime = LocalTime.of(13, 15);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
