package com.sweety.automation.StringRelated;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateString {
    public static void main(String args[]) throws ParseException {
        //=====================
        //Input: "26-May-2018"
        //output: 26/05/2018
        String str = "26-May-2018";
        SimpleDateFormat ff = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = ff.parse(str);

        SimpleDateFormat sdfDestination = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdfDestination.format(date));

    }
}
