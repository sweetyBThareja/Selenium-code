package com.sweety.automation.StringRelated;
//find all permutations of string recursively. For example, all permutations of string “JSP” are,
//http://javaconceptoftheday.com/permutations-of-string-in-java-recursively/

public class PermutationOfString {
    public static void main(String args[]){
        permutationOfString("jsp");
    }

    public static void permutationOfString(String str) {
        StringPermutations("", str);
    }
    public static void StringPermutations(String permutation, String input ){
    if(input.length() == 0){
        System.out.println(permutation);
    }else {
        for(int i = 0; i <input.length(); i++) {
            StringPermutations(permutation + input.charAt(i), input.substring(0,i) + input.substring(i+1, input.length()));
        }
    }
    }
}
