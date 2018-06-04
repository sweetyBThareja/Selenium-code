package com.sweety.automation.StringRelated;

import java.util.Arrays;

//in-progress
public class StringPrgm1 {
    public static void main(String args[]) {
        String str = "jan feb mar";
        char[] chr = str.toCharArray();
        Arrays.sort(chr);
        System.out.println(chr.toString());
    }
}
