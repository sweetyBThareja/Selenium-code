package com.sweety.automation;

/**
 * Created by skumari on 2/1/2018.
 */
public class ASearchRecursion {
    public static int binarySearch(int a[], int first, int last, int key) {
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (a[mid] == key) {
                return mid;
            }
            if (a[mid] > key) {
                return binarySearch(a, first, mid - 1, key); //search in left subarray
            } else {
                return binarySearch(a, mid + 1, last, key); //search in right subarray
            }

        }

        return -1;

    }

    public static void main(String args[]) {
        int a[] = {12, 34, 56, 78, 90, 98};
        int last = a.length - 1;
        int key = 34;
        int result = binarySearch(a, 0, last, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }

    }


}
