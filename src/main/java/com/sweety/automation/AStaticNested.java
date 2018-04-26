package com.sweety.automation;

/**
 * Created by skumari on 2/20/2018.
 */
public class AStaticNested {
    private static int data = 10;
    static class NestedStatic {
       private static void details() {
            System.out.println("I am static nested class");
            System.out.println("data is : " + data);
        }
    }

    public static void main(String args[]){
        AStaticNested.NestedStatic.details();
    }
}
