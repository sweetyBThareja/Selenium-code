package com.sweety.automation.StringRelated;

public class RemoveWhiteSpaces {
    public static void main(String args[]) {
        removeWhiteSpaces("  Core Java jsp servlets             jdbc struts hibernate spring  ");
    }

    public static void removeWhiteSpaces(String str) {
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            char[] charArr = strArr[i].toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                System.out.print(charArr[j]);
            }
        }

    }
}
