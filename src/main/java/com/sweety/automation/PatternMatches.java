package com.sweety.automation;

import org.junit.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatches {
    public static void main(String args[]){
        String str = "Your Phone Number must ";
        String str1 = "Your Phone Number must be entered in this format: 800-555-1212 and may not all be the same number.";
        System.out.println(Pattern.matches("Your Phone Number must be entered in this format:.*", str));
//        Assert.assertTrue("Error - App:- Wrong error message is displaying for telephone",Pattern.matches("[Your Phone Number must be entered in this format:]*", str));
//        Assert.assertTrue("Error - App:- Wrong error message is displaying for telephone",Pattern.matches(str1, str));
////        Assert.assertTrue("Error - App:- Wrong error message is displaying for telephone", profilePage.phoneInvalidErrorMsz.getText().equalsIgnoreCase(expectedMsg));
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6,}", "800-452"));
//        System.out.println(Pattern.matches("\\W", "_"));
//        str1.split("\\d");
//        System.out.println(str1.split("\\d").toString());
        String regex = "[a-zA-Z0-9]*\\W.*";
        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher("-Lokesh-:");
        Matcher matcher = pattern.matcher("Your Phone Number must be entered in this format: 800-555-1212 and");
        System.out.println(matcher.matches());
        System.out.println(str1.contains(str));
        Assert.assertTrue("Error - Env: Your phone number is not in correct format", str1.contains(str));

    }
}
