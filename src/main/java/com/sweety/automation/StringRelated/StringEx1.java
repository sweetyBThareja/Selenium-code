package com.sweety.automation.StringRelated;

public class StringEx1 {
    public static void main(String args[]) {

        String str = "abcdefghijklmnopqrstuvwxyz";
        String st = "";
        for (int i = 0; i < str.length(); i++){
            if(i%2==0){
                st = st + String.valueOf(str.charAt(i)).toUpperCase();
            }else{
                st = st + String.valueOf(str.charAt(i));
            }
        }
        System.out.println(st);
    }
}
