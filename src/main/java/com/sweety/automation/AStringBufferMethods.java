package com.sweety.automation;

/**
 * Created by skumari on 2/6/2018.
 */
public class AStringBufferMethods {
    public static void main(String args[]) {
//        StringBuffer str = new StringBuffer("Hello ");
//        str.append("World"); //append();
//        System.out.println("Append method add new string to existing string : " + str);
//        System.out.println("Insert method insert at specified position : " + (str.insert(5, " new "))); //insert();
//        System.out.println("Replace method : " + str.replace(1,2,"java")); //replace();
//        System.out.println(str); //now str become Hjavallo new  World because stringBuffer is mutable.
//        System.out.println("Delete method : " + str.delete(1,5));
//        System.out.println(str.insert(1,"e"));
//        System.out.println("Reverse of the given string : " + str.reverse());
//        System.out.println("Reverse of the given string : " + str.reverse());
//        System.out.println("Capacity of the buffer : " + str.capacity());
//        System.out.println("Length of the string : " + str.length());
//        str.ensureCapacity(50);
//        System.out.println("Capacity of the buffer : " + str.capacity());
//        System.out.println("CharAt method : " + str.charAt(8));
//        System.out.println("Sub strings of given string are : " + str.substring(10));
//        System.out.println("Sub strings of given string are : " + str.substring(6,9));
        StringBuffer str1 = new StringBuffer("heqqqq");
        StringBuffer str2 = new StringBuffer("heqqqq");
        String str3 = "heqqqq";
        String str4 = "heqqqq";
        System.out.println(str1 == str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));//false -- StringBuffer class doesn't override equals() method
        System.out.println(str3.equals(str4));//true


    }
}
