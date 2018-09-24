package com.sweety.automation.StringRelated;

import java.util.regex.Matcher;
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
//        String stw = "thisisjavabooktutorial";
//        //o/p = "this is java tutorial book"
//        String se = "";
//        System.out.println(stw.replace("book", "") + "book");
        //========================

        // using pattern with flags


        Pattern pattern = Pattern.compile("ab", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("ABcababdAb");
        // using Matcher find(), group(), start() and end() methods
        while(matcher.find()){
            System.out.println("Found the text \"" + matcher.group()
                    + "\" starting at " + matcher.start()
                    + " index and ending at index " + matcher.end());
        }


        // using Pattern split() method
        String str = "one@two#three:four$five";
        pattern = Pattern.compile("\\W");
        String st[] = pattern.split(str);
        for(String s : st){
            System.out.print(s + " ");
        }

        // using Matcher.replaceFirst() and replaceAll() methods
        String ste = "2311234512678";
        pattern = Pattern.compile("1*2");
        Matcher matches = pattern.matcher(ste);
        System.out.println(matches.replaceAll("_"));
        System.out.println(matches.replaceFirst("_"));

        //a1@b1$ = 1a@1b$
        String strr = "a1@b1$";
        char [] ch = strr.toCharArray();
        for(int i = 0; i< ch.length; i++){
            if(String.valueOf(strr.charAt(i)).matches("[a-zA-Z]")){
                if(String.valueOf(strr.charAt(i+1)).matches("\\d")){
                    char temp;
                    temp = ch[i];
                    ch[i] = ch[i+1];
                    ch[i+1] = temp;
                }
            }
        }
        System.out.println(new String(ch));






 }}

