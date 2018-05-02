package com.sweety.automation.StringRelated;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
//    Two strings are called anagrams if they contain same set of characters but in different order. For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” are some anagrams.
// http://javaconceptoftheday.com/anagram-program-in-java/
  public static void main(String args[]){
      anagramUsingSort("peek", "keep");
      anagramUsingSort("peek", "javaa");
      anagramUsingSort("Debit Card", "Bad Credit");
      anagramUsingHashMap("peek", "keep");
      anagramUsingHashMap("Debit Card", "Bad Credit");
  }

  public static void anagramUsingSort(String str1, String str2){
      boolean bool = true;
      String copyOfStr1 = str1.replaceAll("\\s", ""); //replace all white space
      String copyOfStr2 = str2.replaceAll("\\s", "");


      if(copyOfStr1.length() != copyOfStr2.length()){
          bool = false;
      }else{
          char [] charArr1 =  copyOfStr1.toLowerCase().toCharArray();
          char [] charArr2 = copyOfStr2.toLowerCase().toCharArray();
          Arrays.sort(charArr1);
          Arrays.sort(charArr2);
         bool = Arrays.equals(charArr1,charArr2);
      }

      if(bool){
          System.out.println("Both strings are anagram");
      }else{
          System.out.println("Both strings are not anagram");
      }

  }

  public static void anagramUsingHashMap(String st1, String st2){
      boolean bool = true;
      String copyOfStr1 = st1.replaceAll("\\s", ""); //replace all white space
      String copyOfStr2 = st2.replaceAll("\\s", "");


      if(copyOfStr1.length() != copyOfStr2.length()){
          bool = false;
      }else {
          HashMap<Character, Integer> map = new HashMap<>();
          for(int i = 0; i <copyOfStr1.length(); i++){
              char c = copyOfStr1.charAt(i);
              int charCount = 0;
              if(map.containsKey(c)){
                  charCount = map.get(c);
              }
              map.put(c,++charCount);
              c = copyOfStr2.charAt(i);
              charCount = 0;
              if(map.containsKey(c)){
                  charCount = map.get(c);
              }
              map.put(c, --charCount);
          }

          for(int value : map.values()){
              if(value != 0){
                  bool = false;
              }
          }
      }

      if(bool){
          System.out.println("Both strings are anagram");
      }else{
          System.out.println("Both strings are not anagram");
      }
  }

}

