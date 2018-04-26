package com.sweety.automation;

/**
 * Created by skumari on 1/31/2018.
 */
public class AIfStatement {
    public static void main(String args[]){
        int i = 10;
        int j = 50;
        int k = 20;
        if(i > j && i > k) {
            System.out.println("Largest number is " + i);
        }
            else if(j > k){
            System.out.println("Largest number is " + j);
        }

        else {
            System.out.println("Largest number is " + k);
        }
    }
}
