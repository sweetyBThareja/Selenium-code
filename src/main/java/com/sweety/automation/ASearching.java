package com.sweety.automation;

/**
 * Created by skumari on 2/1/2018.
 */
public class ASearching {
    public static void main(String args[]){
        int [] a = {17,23,4,18,34,92};
        int key = 18;
        for(int i = 0; i<a.length; i++){
            if(a[i] == key){
                System.out.println("Element found at index " + i); //Linear search
            }
        }
    }
}
