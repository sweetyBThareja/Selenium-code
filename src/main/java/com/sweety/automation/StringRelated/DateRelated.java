package com.sweety.automation.StringRelated;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateRelated {
    public static void main(String args[]){
//    Date dNow = new Date();
//    System.out.println(dNow);
//    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//            System.out.println(format.format(dNow));

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        String date = "16/08/2016";
//
//        //convert String to LocalDate
//        LocalDate localDate = LocalDate.parse(date, formatter);
//        System.out.println(localDate);
//        //convert LocalDate to String
//        System.out.println(formatter.format(localDate));
//
//
//        //===================
//
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("E, MMM d yyyy");
//
//        String date1 = "Tue, Aug 16 2016";
//
//        LocalDate localDate1 = LocalDate.parse(date1, formatter1);
//
//        System.out.println(localDate1);
//
//        //Local date to String
//        System.out.println(formatter1.format(localDate1));
//
//
//        //========================
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
//
//        String date2 = "26 May 2018";
//
//        LocalDate localDate2 = LocalDate.parse(date2, formatter2);
//
//        System.out.println(localDate2);
//
//        //Local date to String
//        System.out.println(formatter2.format(localDate2));

        //=====================
//        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//
//        String date3 = "26-May-2018";
//
//        LocalDate localDate3 = LocalDate.parse(date3, formatter3);
//
//        System.out.println(localDate3);
//
//        //Local date to String
//        System.out.println(formatter3.format(localDate3));

        //=====================
        //Input: "26-May-2018"
        //output: 26/05/2018
        DateTimeFormatter ff = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String str = "26-May-2018";
        LocalDate date = LocalDate.parse(str, ff); //convert String to date in same format
        DateTimeFormatter fff = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fff.format(date)); //convert date to sting in different format


        //======================
        //input: 30-June-2018 01:22:23
        //output: 30/Jun/2018 01/22/23
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        String str1 = "30-June-2018 01:22:23";
        LocalDateTime dateTime = LocalDateTime.parse(str1, dtf);
        System.out.println(dateTime);
        DateTimeFormatter dtff = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH/mm/ss");
        System.out.println(dtff.format(dateTime));

        //============
        //output:yyyyMMdd
        LocalDate dateee = LocalDate.now();
        DateTimeFormatter fffr = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println("After formatting" + fffr.format(dateee));

        //output: yyyy-MM-dd HH:mm:ss
        LocalDateTime dtime = LocalDateTime.now();
        DateTimeFormatter ftr = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("After Formatting into yyyy-MM-dd HH:mm:ss " + ftr.format(dtime));

        //timezone : Adding a time zone to LocalDateTime
        Instant timeStamp= Instant.now();
        ZonedDateTime zdt = dtime.atZone(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime zzdt = timeStamp.atZone(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);
        System.out.println(zzdt);

}}
