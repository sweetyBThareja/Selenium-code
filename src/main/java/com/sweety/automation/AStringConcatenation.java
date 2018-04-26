package com.sweety.automation;

/**
 * Created by skumari on 2/5/2018.
 */
public class AStringConcatenation {
    public static void main(String args[]){
        String S1 = "Ram";
        String S2 = "Shyam";
        String s3;
        String result = S1.concat(S2);
        System.out.println(result);
        s3 = S2 + S1;
        System.out.println(s3);
        System.out.println("2" + (1 + 3));
        System.out.println(2 + (1 + 3) + "9");

    }

}
