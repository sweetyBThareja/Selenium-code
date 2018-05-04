package com.sweety.automation.StringRelated;

//Swapping of two string variables without third variable
//http://javaconceptoftheday.com/swap-two-string-variables-without-using-third-or-temp-variable-in-java/
public class SwapStrings {
    public static void main(String args[]){
        swapStringsWithoutThirdVar("java", "j2see");
        swapStringsWithoutThirdVar("java is", "j2ee is");
    }

    public static void swapStringsWithoutThirdVar(String str1, String str2){
        System.out.println("Before swapping str1 is : " + str1);
        System.out.println("Before swapping str2 is : " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swapping str1 is : " + str1);
        System.out.println("After swapping str2 is : " + str2);
    }
}
