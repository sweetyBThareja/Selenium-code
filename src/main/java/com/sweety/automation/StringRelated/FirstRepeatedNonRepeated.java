package com.sweety.automation.StringRelated;
//Find First Repeated And Non-Repeated Character In A String
//http://javaconceptoftheday.com/first-repeated-and-non-repeated-character-in-a-string/

import java.util.HashMap;

public class FirstRepeatedNonRepeated {
    public static void main(String args[]) {
        firstRepeatedNonRepeated("JavaConceptOfTheDay");
    }

    public static void firstRepeatedNonRepeated(String str) {
        HashMap<Character, Integer> charMapCount = new HashMap<>();
        char[] charArr = str.toCharArray();
        Character rptchar = null;
        for (char c : charArr) {
            if (charMapCount.containsKey(c)) {
                charMapCount.put(c, charMapCount.get(c));
            } else {
                charMapCount.put(c, 1);
            }
        }
        for (char ch : charArr) {
            if (charMapCount.get(ch) == 1) {
                System.out.println("First Non-repeated character : " + ch);
                break;
            }
        }
        for (char c : charArr) {
            if (charMapCount.get(c) > 1) {
                System.out.println("First repeated character : " + c);
                break;
            }
        }

    }
}
