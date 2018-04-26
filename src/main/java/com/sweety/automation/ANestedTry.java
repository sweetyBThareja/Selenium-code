package com.sweety.automation;

/**
 * Created by skumari on 2/9/2018.
 */
public class ANestedTry {
    public static void main(String args[]){
        System.out.println("Nested try execution started");
        try{
            int data = 10;
            data = data/2;
            try{
                int result;
                int a [] = new int[5];
                result = a[5];
                System.out.println(result);
            }catch(IndexOutOfBoundsException e){System.out.println("Index out of bounds exception occurred");}

        }catch(ArithmeticException e){System.out.println("Arithmetic Exception occurred");}
    }
}
