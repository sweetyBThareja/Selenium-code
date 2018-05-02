package com.sweety.automation.StringRelated;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {
    public static void main(String args[]){
        duplicateWords("java java hello java");
    }

    public static void duplicateWords(String str){
        HashMap<String, Integer> stringCountMap = new HashMap<>();
        String [] strArr = str.split(" ");
        for(String st : strArr){
            if(stringCountMap.containsKey(st)){
                stringCountMap.put(st,stringCountMap.get(st)+1);
            }else{
                stringCountMap.put(st,1);
            }
        }
        Set<String> stringWords = stringCountMap.keySet();
        for(String ss : stringWords){
            if(stringCountMap.get(ss)>1){
                System.out.println("Duplicate Words in string " + ss + ": " + stringCountMap.get(ss));
            }
        }
    }
}
