package com.oca.studyguide.chapter3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodsOfTime {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 10);
        LocalDate end = LocalDate.of(2015, Month.JANUARY, 20);

        Period dailyPeriod = Period.ofDays(1);

        performAnimalEnrichment(start, end, dailyPeriod);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {

        LocalDate upTo = start;

        while (upTo.isBefore(end)) {

            System.out.println("Give me new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}