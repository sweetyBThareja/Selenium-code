package com.sweety.automation.StringRelated;

public class OccuranceOfChar {
    public static void main(String args[]){
        occurrenceOfGivenChar("java is a programming language");
    }

    public static void occurrenceOfGivenChar(String str){
        char c = 'g';
        int count = 0;
        for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == c){
            count++;
        }
    }
    System.out.println("Occurrence of given char " + c + " : " + count);
    }
}
