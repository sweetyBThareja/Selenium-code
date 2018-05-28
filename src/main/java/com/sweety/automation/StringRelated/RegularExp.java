package com.sweety.automation.StringRelated;

import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String args[]){
//    String string = "ind12ia2122";
//    System.out.println(string.replaceAll("[1-9]","") + string.replaceAll("[a-z]",""));
        //or
//        String str = "!@@ind123:ia45#$";
//        String st = "";
//        String num = "";
//        String stt = "";
//        String sh = "";
//        char [] ch = str.toCharArray();
//        for(int i=0; i<ch.length; i++){
//            if(String.valueOf(ch[i]).matches("[^a-zA-Z0-9]")){
//                st = st + String.valueOf(ch[i]);
//            }else if(String.valueOf(ch[i]).matches("[a-z]")){
//                stt = stt + String.valueOf(ch[i]);
//            }
//            else{
//                num = num + String.valueOf(ch[i]);
//            }
//        }
//        System.out.println(st + stt + num);
//
//        //or
//        for(int i = 0; i < str.length(); i++){
//            if(String.valueOf(str.charAt(i)).matches("[a-z]")){
//                sh = sh +String.valueOf(str.charAt(i));
//            }
//        }
//        System.out.println(sh);

        //==========================
//        String str = "ind123ia54";
//        String sh = "";
//        String shr = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (String.valueOf(str.charAt(i)).matches("\\D")) {
//                sh = sh + String.valueOf(str.charAt(i));
//            } else {
//                shr = shr + String.valueOf(str.charAt(i));
//            }
//        }
//        System.out.println(sh + shr);

 //=========================================

        //contains in string
//        String stw = "thisisjavaooktutorial";
//        if(stw.contains("book")){
//            System.out.println("this string contains book");
//        }else {
//            System.out.println("this string not contains book");
//        }
//      //using pattern matches
//        String pattern = ".*book.*";
//        boolean isMatches = Pattern.matches(pattern, stw);
//        System.out.println("This text contains book ?" + isMatches);

        //===========================

//        String stw = "this is java book tutorial";
//        //o/p = "this is java tutorial book"
//        String [] str = stw.split("\\s");
//        String sw = "";
//        for(String sh : str){
//            if(!sh.equalsIgnoreCase("book")){
//                sw = sw + " " + sh;
//            }
//        }
//        System.out.println("o/p is : " + sw + " book");

        //==============================
        String stw = "thisisjavabooktutorial";
        //o/p = "this is java tutorial book"
        String se = "";
        System.out.println(stw.replace("book", "") + "book");


 }}

