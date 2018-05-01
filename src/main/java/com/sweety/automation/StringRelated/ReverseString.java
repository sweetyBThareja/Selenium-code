package com.sweety.automation.StringRelated;

public class ReverseString {
    public static void main(String args[]) {
        reverseString("java is popular language");
        reverseStringUsingItertive("I am good in java");
        System.out.println();
        reverseEachWord("I am intelligent and powerful");
    }

    public static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static void reverseStringUsingItertive(String str) {
        char[] charArr = str.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }

    }

    public static void reverseEachWord(String str) {
        String[] strArr = str.split(" ");
        String reverseString = "";

        for (int i = 0; i < strArr.length; i++) {
            char[] charArr = strArr[i].toCharArray();
            String reverseWords = "";
            for (int j = charArr.length - 1; j >= 0; j--) {
                reverseWords = reverseWords + charArr[j];
            }
            reverseString = reverseString + reverseWords + " ";
        }

        System.out.println(str);
        System.out.println(reverseString);
        System.out.println("------------");

    }
}
