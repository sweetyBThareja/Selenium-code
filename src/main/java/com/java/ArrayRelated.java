package com.java;


import java.util.Arrays;

public class ArrayRelated {
    public static void main(String args[]) {
        int[] arr = {43, 23, 33, 67, 12, 3, 8};
        //Maximum:
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    //Sorting
        int temp;
        for(int i = 0; i <arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
              if(arr[i] > arr[j]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }

            }
        }
        //Bubble sort:
//        for(int i = 0; i <arr.length; i++){
//            for(int j = 1; j < arr.length-i; j++){
//                if(arr[j-1] > arr[j]){
//                    temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
//             for(int s : arr){
//                 System.out.print(s + " ");
//             }
//                System.out.println();
//            }
//        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Searching -- Linear search
        int key = 33;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index " + i);
            }
        }


        //Binary Search
        int first = 0;
        int last = arr.length-1;
        int mid = (first + last)/2;
        System.out.println(mid);
        if(key < arr[mid] ){
            for(int i = 0; i<mid; i++){
                if(arr[i] == key) {
                    System.out.println("key found at index " + i);
                    break;
                }
            }
        }else if(key > arr[mid]) {
            for(int i = mid; i<arr.length; i++){
                if(arr[i] == key) {
                    System.out.println("key found at index " + i);
                    break;
                }
            }
        }else if (key == arr[mid]){
            System.out.println("key found at mid having index " + mid);
        }else {
            System.out.println("Key not found");
        }

        //Binary search using recursion
       int result = binarySearch(arr, 0, last, 67);
        if(result == -1){
            System.out.println("key not found");

        }else {
            System.out.println("key found at index " + result);
        }


    }

    public static int binarySearch(int [] arr, int first, int last, int key){
        if(last >= first) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                return binarySearch(arr, 0, mid, key);
            } else {
                return binarySearch(arr, mid + 1, last, key);
            }
        }
        return -1;
    }
}
