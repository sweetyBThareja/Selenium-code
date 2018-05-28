package com.sweety.automation.StringRelated;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRelated {
    public static void main(String args[]){
    Date dNow = new Date();
    DateFormat destDf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(destDf.format(dNow));
}}
