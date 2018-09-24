package com.sweety.automation.StringRelated;

//Longest sub-string without repeating characters:
//https://www.programcreek.com/2013/02/leetcode-longest-substring-without-repeating-characters-java/

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {
    public static void main(String arg[]){
        //System.out.println(longestSubstring("javaconceptoftheday"));
        //System.out.println(longestSubstring("ABDEFGABEF"));
        longestSubstirngHashMap("javaconceptoftheday");

    }

    public static int longestSubstring(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        int result = 0;
        int k=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                result = Math.max(result, set.size());
            }else{
                while(k<i){
                    if(s.charAt(k)==c){
                        k++;
                        break;
                    }else{
                        set.remove(s.charAt(k));
                        k++;
                    }
                }
            }
        }

        return result;
    }

    public static void longestSubstirngHashMap(String str){
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char [] charArr = str.toCharArray();
        String longestStr = null;
        int lengthOfStr = 0;

        for(int i = 0; i<charArr.length; i++){
            char ch = charArr[i];
            if(!charCountMap.containsKey(ch)){
                charCountMap.put(ch, i);
            }else{
                i = charCountMap.get(ch);
                charCountMap.clear();
            }

            if(charCountMap.size() > lengthOfStr){
                lengthOfStr = charCountMap.size();
                longestStr = charCountMap.keySet().toString();
            }


        }
        System.out.println("longest substring of unique char : " + longestStr);
        System.out.println("length substring of unique char : " + lengthOfStr);
    }
}
