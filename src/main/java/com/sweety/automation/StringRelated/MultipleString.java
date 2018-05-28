package com.sweety.automation.StringRelated;

public class MultipleString {
    public static void main(String args[]) {
        String str = "hai hi hai hello hai";
        //o/p hai : 3
        int count = 0;
        String st[] = str.split("\\s");
        for (String sh : st) {
            if (sh.equalsIgnoreCase("hai")) {
                count++;
            }
        }
     System.out.println("count of hai " + count );
    }
}
