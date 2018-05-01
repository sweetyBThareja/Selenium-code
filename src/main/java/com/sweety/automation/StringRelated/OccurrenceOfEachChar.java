package com.sweety.automation.StringRelated;

import java.util.HashMap;

public class OccurrenceOfEachChar {
    public static void main(String args[]){
        occurrenceOfEachChar("java is a programming language");
        occurrenceOfEachChar("All Is Well");

    }

    public static void occurrenceOfEachChar(String str){
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char [] charArr = str.toCharArray();
        for(char c : charArr){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else{
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);
    }
}
