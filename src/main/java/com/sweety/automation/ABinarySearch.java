package com.sweety.automation;

import java.util.Arrays;

/**
 * Created by skumari on 2/1/2018.
 */
public class ABinarySearch {
    public static void binarySearch(int a[], int first, int last, int key){
        int mid = (first + last)/2;
        while(first <=last){
            if(a[mid] < key){
                first = mid + 1;
            }else if(a[mid] == key){
                System.out.println("Elements found at index " + mid);
                break;
            }else {
                last = mid - 1;
            }

            mid = (first + last)/2;
        }

        if(first > last){
            System.out.println("Element not found");
        }

    }

    public static void main(String args[]) {
        int[] a = {34,65,15,24,29,31}; //For Binary search -- array must be sorted
        int key = 29;
        int last = a.length-1;
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " "); //15 24 29 31 34 65
        }
        System.out.println();
        binarySearch(a, 0, last, key);
    }
}
