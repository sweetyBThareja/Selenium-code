package com.sweety.automation.StringRelated;

public class StringImmutable {
    public static void main(String args[]){
        String str1 = "java";
        String str2 = "java";
        System.out.println(str1==str2);
        str1 = "j2ee" + str1;
        System.out.println(str1 == str2);
    }
}
