package com.sweety.automation;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by skumari on 2/21/2018.
 */
public class ADateTime {
    public static void main(String args[]) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalTime.of(6, 15, 30, 200));
//        System.out.println(LocalDate.of(2018,24 , 20));
//        //System.out.println(LocalDate.of(2015, Month.JANUARY, 32));
      //  LocalDate date = LocalDate.of(2018, Month.AUGUST, 31);
//        System.out.println(date);
        //date = date.plusDays(2);
//        System.out.println(date);
//        date = date.plusWeeks(1);
//        System.out.println(date);
//        date = date.plusMonths(1);
//        System.out.println(date);
//        date = date.plusYears(1);
//        System.out.println(date);
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);

        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());

//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//        Period p = Period.ofDays(1).ofYears(2);
//        d = d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
//                .SHORT);
//        System.out.println(f.format(d));

        //Period:
        LocalDate start = LocalDate.of(2018, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2018, Month.MARCH, 31);
        Period period = Period.ofMonths(1); //Every one month
        performAnimalEnrichment(start, end, period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
//        while (upTo.isBefore(end)) { //isBefore() -- Checks if this date is before the specified date.
//            System.out.println("Give new toy " + upTo);
//            upTo = upTo.plus(period);
//        }
        //Formatting dates and times:
        LocalDate date = LocalDate.of(2018, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(6, 15, 30, 200);
//        System.out.println(date.getDayOfWeek());
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getYear());
//        System.out.println(date.getDayOfYear());
//        //DateTimeFormatter class
//        System.out.println("DateTimeFormatter class");
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        dateTime.plusHours(1);
//        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE));
//        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(dateTime.format(DateTimeFormatter.ISO_TIME));
//        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
//        System.out.println(dateTime.format(f));
//        //Parsing:
//        DateTimeFormatter fo = DateTimeFormatter.ofPattern("MM dd yyyy");
//        LocalDate de = LocalDate.parse("01 02 2018", fo);
//        LocalTime te = LocalTime.parse("11:22");
//        System.out.println(de);
//        System.out.println(te);

    }
}
