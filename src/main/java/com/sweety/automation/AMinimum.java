package com.sweety.automation;

/**
 * Created by skumari on 2/1/2018.
 */
public class AMinimum {
    static void min(int[] a){ //Passing array to a method
        int min = a[0];

        for(int i =0; i<a.length; i++){
            if(a[i] < min){
               min = a[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String args[]){
        int[] a = {10,30,4,8,21};
        min(a);
    }
}

