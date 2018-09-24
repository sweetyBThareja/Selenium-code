package com.sweety.automation.StringRelated;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChar {
    public static void main(String args[]){
        duplicateChar("java is popular language");
        duplicateChar("JavaJ2EE");

    }

    public static void duplicateChar(String str){
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char [] charArr = str.toCharArray();
        for(char c : charArr){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate keys in string");
        for(char ch : charsInString){
            if(charCountMap.get(ch) > 1){
                System.out.println(ch + " : " +charCountMap.get(ch));
            }
        }
    }
}
