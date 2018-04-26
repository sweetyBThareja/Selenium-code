package com.sweety.automation;

/**
 * Created by skumari on 2/5/2018.
 */
public class AStringMethods {
    public static void main(String args[]) {
        String str = "I am learning java programming language. Java is very interesting language";
//        String str1 = "abcd";
//        String str2 = "abcd";
//        String str3 = "ABCD";
//        System.out.println("Length of the string is : " + str.length()); //length method()
        System.out.println("Index of given character : " + str.indexOf('a')); //indexOf()
        System.out.println("Index of given character : " + str.indexOf("ar"));
        System.out.println("Index of given character : " + str.indexOf('l', 4));
        System.out.println("Index of given character : " + str.indexOf("am", 8)); //Will check after index 8 if not found return -1
//        System.out.println("Character at index : " + str.charAt(28)); //charAt()
//        System.out.println("Sub String of given string is : " + str.substring(5, 8)); //will go from 5 to 7, index starts from 0
//        System.out.println("Sub strings of given string are : " + str.substring(41));
//        System.out.println("Sub strings of given string are : " + str.substring(str.indexOf('J'))); //Same as above.
//        System.out.println("Sub strings of given string are : " + str.substring(71, 71)); //same index -- empty string
//        // System.out.println("Sub strings of given string are : " + str.substring(41,40)); //Throws error -- index starts from 41 and never goes back to 40
//        // System.out.println("Sub strings of given string are : " + str.substring(71,80)); //throws error -- there is no 80th character
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str);
//        System.out.println(str1.equals(str2)); //true
//        System.out.println(str1.equals(str3)); //false
//        System.out.println(str1.equalsIgnoreCase(str3)); //true
//        System.out.println(str1.startsWith("ab")); //true
//        System.out.println(str1.startsWith("A")); //false
//        System.out.println(str1.endsWith("D")); //false
//        System.out.println(str1.endsWith("d")); //true
//        System.out.println(str.contains("language")); //true
//        System.out.println(str.replace('j', 'J'));
//        System.out.println("abcde".replace("abc","new"));
//        System.out.println("   a b c  ".trim());
//        String aa = null;
        //System.out.println(aa.concat("cd"));
//        System.out.println(aa + "cd");
//        String b = " ";
//        System.out.println(b + "cd");
//        String S = "abc";
//        String S1 = S.concat("d"); //Create new object reference
//        String SS = "abc" + "d";
//        String SSS = S + "d";
//        String SSSS = "abcd";
//        System.out.println(SSSS == SS); //true
//        System.out.println(SSSS == SSS); //false -- we are adding "d" in reference variable S, so it will create new obj which pointing to abcd
//        System.out.println(SSSS == S1);

    }
}
