package com.sweety.automation;

import java.lang.reflect.Array;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by skumari on 2/15/2018.
 */
//https://www.tutorialspoint.com/javaexamples/java_arrays.htm
public class ProgramsArray {
   static int k;
//    //Sorting:
//    //numeric array
    public static void main(String args[]) {
//        int[] a = {23, 4, 53, 12, 49};
//        Arrays.sort(a);
////        int temp = 0;
//        int last = a.length-1;
//
//                for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] > a[j]) {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//
//        for(int k = 0; k<a.length; k++){
//            System.out.print(a[k] + " ");
//        }
//
//    //Searching:
//        //linear search:
//        System.out.println();
//        int key = 12;
//        for(int l = 0; l<a.length; l++){
//        if(a[l] == key){
//            System.out.println(a[l] + " Key found at index " + l);
//        }
//
//        }
//        int result = binarySearch(a, 0, last, 12);
//        //part of binary search recursion
//        if(result == -1){
//            System.out.println("Element not found");
//        }else{
//            System.out.println("Element found at index " + result);
//        }

//
////        //binary search:
////        public static int binarySearch(int []a, int first, int last, int key){
//        int mid = (first + last)/2;
//        while(first <=last){
//            if(a[mid] == key){
//                System.out.println("key found at index " + mid);
//                break;
//            }else if(a[mid] < key){
//                first = mid +1;
//            }else{
//                last = mid - 1;
//            }
//
//            mid = (first + last)/2;
//        }
//        return mid;
//   }
//
//    //recursion:
//    public static int binarySearch(int[] a, int first, int last, int key) {
//        if(last >= first){
//            int mid = first + (last - first)/2;
//            if(a[mid] == key){
//                return mid;
//            }
//
//            if(a[mid] < key){
//              return binarySearch(a, mid+1, last, 12);
//            }else{
//                return binarySearch(a, 0, mid-1, 12);
//            }
//        }
//
//        return -1;
//    }

//    //insert an element in array
//    public static void main(String ... a) {
//        int [] k = {1,2,4,5,7,8,3};
//        int index = 2;
//        int arrLength = k.length;
//        int[] ia = new int[arrLength + 1];
//        System.out.println("Before Inserting element in array");
//        System.arraycopy(k, 0, ia, 0, arrLength);
//        for(int i = 0; i<ia.length; i++){
//            System.out.print(ia[i] + " ");
//        }
//        System.out.println();
//        ia[index] = 35;
////        System.arraycopy(k, index, ia, index+1, arrLength-index);
//        for(int i = 0; i<ia.length; i++){
//            System.out.print(ia[i] + " ");
//        }
//
//    }

//    //Determine upper bound of two dimensional array a[3][4] -- print length of array of array
//    public static void main(String args[]) {
//        int[][] a = new int[3][4];
//        System.out.println(a.length);
//        System.out.println(a[0].length);
//    }


//    static public void sayHello(){
//        System.out.println("hello world");}


//    //reverse an array
//    public static void main(String args[]){
//        int t;
//        int a = 0;
//        int b =0;
//        int c = 0;
//        for(t = (int)(Math.random()* 10.0); a<5,a++,b+10; ProgramsArray.sayHello()){}
//    }
//        int [] a = {3,2,9,4,56,24,54};
//        int temp;
//        for(int i = 0; i<a.length/2; i++){
//        temp = a[i];
//        a[i] = a[a.length-i-1];
//        a[a.length-i-1] = temp;
//        }
//        for(int k = 0; k<a.length;k++){
//            System.out.print(a[k] + " ");
//        }
//    }

    //Search minimum and maximum value in array:
   // public static void main(String args[]) {
//        int a[] = {1,2,6,0,23,43,1};
//        int min = a[0];
//        int max = a[0];
//        for(int i = 0; i<a.length; i++){
//            if(a[i] < min){
//                min = a[i];
//            }else if(a[i] > max){
//                max = a[i];
//            }
//        }
//        System.out.println("Minimum number in array is: " + min);
//        System.out.println("Maximum number in array is: " + max);
//
//

//        ArrayList a = new ArrayList();
//        a.add("hello");
//        a.add("world");
//        System.out.println(a);
//
//        ArrayList<String> b = new ArrayList<>();
//        b.add("hello");
//        b.add("world");
//        b.add("java");
//        for (String s : b) {
//            System.out.println(s);
//        }
//        for (Object s : b) {
//            System.out.println(s);
//        }
//

//        //Merge two arrays:
//        int a [] = {1,4,7,3,9};
//        int [] b = {4,9,12,13,51};
//        int c[] = new int[a.length + b.length];
//        int count = 0;
//        for(int i = 0; i<a.length; i++){
//            c[i] = a[i];
//            count++;
//        }
//        for(int j = 0; j< b.length; j++){
//            c[count] = b[j];
//            count++;
//        }
//        for(int l = 0; l<c.length; l++){
//            System.out.print(c[l] + " ");
//        }

    //or
    //Merge two array:
//    int [] b = {21, 45, 76, 34,87};
//    int c[] = new int[a.length + b.length];
//        System.arraycopy(a, 0, c, 0, a.length);
//        for(int i=0; i< c.length; i++){
//        System.out.print(c[i] + " ");
//    }
//        System.out.println();
//        System.arraycopy(b, 0, c, a.length, c.length-a.length);
//        for(int i=0; i< c.length; i++){
//        System.out.print(c[i] + " ");
//    }

//        //fill an array:
//        int a[] = new int[6];
//        Arrays.fill(a, 20); //Arrays.fill(arrayname,value)
//        for(int data : a){
//            System.out.println(data);
//        }
//        System.out.println("Fill different value at differnt position");
//        Arrays.fill(a, 2, 4, 10); //Arrays.fill(arrayname, starting index, ending index, value)
//        for(int data : a){
//            System.out.println(data);
//        }

//        //Extend an array:
//        int a [] = {1,4,5,7};
//        int b[] = new int[6];
//        b[4] = 2;
//        b[5] = 9;
//        System.arraycopy(a, 0, b, 0, a.length);
//        for(int l : b){
//            System.out.println(l);
//        }

//        //Remove an element from Array or ArrayList:
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(5);
//        list.add(7);
//        System.out.println("Actual Array: ");
//        for(int a : list){
//            System.out.println(a);
//        }
//        list.remove(2);
//        System.out.println("After removal: ");
//        for(int a : list){
//            System.out.println(a);
//        }
    //From Array:
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
//      int [] arr = {12,1,32,4,5,67};
//        int key = 32;
//        int k = 2;
//        int [] ar = new int[arr.length-1];
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == key){
//            k = i;
//        }}
//        System.arraycopy(arr, 0, ar, 0, ar.length-k-1);
//        for(int i=0; i< ar.length; i++){
//            System.out.print(ar[i] + " ");
//        }
//        System.out.println();
//        System.arraycopy(arr, k+1, ar, k, ar.length-k);
//        for(int i=0; i< ar.length; i++){
//            System.out.print(ar[i] + " ");
//        }
// or
// int a[] = {1, 4, 2, 6, 8, 3, 9, 5};
//        int key = 6;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == key) {
//                System.out.println(i);
//                k = i;
//                System.out.println(k);
//                break;
//            }
//
//        }
//
//        for (int i = k; i < a.length - 1; i++) {
//
//            a[i] = a[i + 1];
//
//        }
//        System.out.println(Arrays.toString(a));


//        //common elements in arrays:
//        int a [] = {1,2,3,4,5,9,6};
//        int b [] = {3,10,23,5,7,8};
//        for(int i = 0; i<a.length; i++){
//            for(int j = 0; j<b.length; j++){
//                if(a[i] == b[j]){
//                    System.out.println(a[i]);
//                }
//            }
//        }

//        //common elements in three shorted arrays:
//        int []a = {1,2,3,4,6,8};
//        int []b= {0,2,3,5,6,7,5};
//        int []c = {3,6,9,10};
//
//        int x = 0, y = 0, z = 0;
//
//        while(x < a.length && y < b.length && z < c.length){
//         if(a[x] == b[y] && b[y] == c[z]){
//             System.out.println("Common elements are : " + a[x]);
//             x++;
//             y++;
//             z++;
//         }else if(a[x] < b[y]){
//             x++;
//         }else if(b[y] < c[z]){
//             y++;
//         }else{
//             z++;
//         }
//
//        }
// }


//        //Same/duplicate elements in array:
//        int a[] = {1,2,4,6,3,2,4};
////        for(int i : a){
////            System.out.print(i + " ");
////        }
////        System.out.println("Common elements in array: ");
////        for(int i = 0; i<a.length; i++){
////            for(int j = i+1; j<a.length; j++) {
////                if (a[i] == a[j]) {
////                    System.out.println(a[i]);
////                }
////            }
////        }

//        //Find an element in array:
//        int a [] = {1,2,3,5,6,8,9};
//        int key = 6;
//        for(int i = 0; i<a.length; i++){
//            if(a[i] == key){
//                System.out.println("kay found at index: " + i);
//            }

//        //Arrays are equal:
//        int a [] = {1,2,3,4};
//        int b [] = {1,2,3,4};
//        int c[] = {2,3,4,1};
//        boolean result = false;
//        System.out.println(Arrays.equals(a,b));
//        System.out.println(Arrays.equals(a,c));
//        //OR
//        for(int i = 0; i<a.length; i++){
//            for(int j = i; j<i+1; j++){
//                if(a[i] == b[j]){
//                    result = true;
//                }
//                }
//            }
//        if(result == true) {
//            System.out.println("Arrays are : " + result);
//        }else{
//            System.out.println("Arrays are : " + result);
//        }

//    //Sum values of an array and average
//        int a[] = {3,2,4,6,1,7,5};
//        int sum = 0;
//        float avg;
//        for(int i=0; i<a.length; i++){
//            sum+=a[i];
//        }
//        avg = sum/(a.length);
//        System.out.println(sum);
//        System.out.println(avg);

//        //index of an element:
//        int a [] = {4,5,7,2,9};
//        int key = 2;
//        for(int i = 0; i<a.length; i++){
//            if(a[i] == key){
//                System.out.println("index of key : " + i);
//                break;
//            }
  //      }

////Remove duplicate element from array: and showing only duplicate element
//        int a [] = {23,22,45,32,54,11,85,10,22,54};
//        Arrays.sort(a);
//        System.out.println("After sorting : ");
//        for(int i : a){
//            System.out.print(i + " ");
//        }
//        int temp [] = new int[a.length];
//        int temp1[] = new int[a.length];
//        int count = 0;
//        int count1 = 0;
//        for(int i = 0; i<a.length-1; i++){
//            if(a[i]!=a[i+1]){
//                temp[count++] = a[i];
//            }if(a[i] == a[i+1]){
//                temp1[count1++] = a[i];
//            }
//        }
//        temp[count++] = a[a.length-1];
//        System.out.println();
//        for(int j =0 ; j<count; j++){
//            System.out.print(temp[j] + " ");
//        }
//        System.out.println();
//        for(int j =0 ; j<count1; j++){
//            System.out.print(temp1[j] + " ");
//        }

    }

        //Array to ArrayList and ArrayList to array:
//        int [] a = {2,34,12,14,34,56};
//        String [] list1 = {"Hello", "java", "world", "new"};
//        //List<Integer> list = new ArrayList<Integer>(Arrays.asList(a)); //int is not applicable
//        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(list1));
//        System.out.print(list2 + " ");
//        System.out.println();
//        System.out.println("ArrayList to Array : ");
//        String [] str = new String[list2.size()];
//        list2.toArray(str);
//        for(String S : str){
//            System.out.print(S + " ");
//        }

//        //Pairs of elements whose sum is specified number
//        int [] a = {2,4,6,7,8,3};
//        int number = 10;
//        for(int i = 0; i<a.length;i++){
//            for(int j = 0; j<a.length; j++){
//                if(a[i] + a[j] == number){
//                    System.out.println(a[i] + " " + a[j] + " " + number);
//                }
//            }
//        }


        //Move all the zeros at the end of array: Same as sorting instead of a[i] > a[j], use a[i] == 0
//        int a [] = {1,2,0,3,0,12,0};
//        int temp;
//        for(int i = 0; i < a.length; i++){
//            for(int j = i+1; j <a.length; j++){
//                if(a[i] == 0){
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for(int i : a) {
//            System.out.print(i + " ");
//        }


//    }

    //Sorting -- Bubble, Insertion, Merge, Selection, Quick

    //    int [] ar = {12,34,3,2,8,43,67};
//        for(int i : ar){
//        System.out.print(i + " ");
//    }
    int temp;
    //Bubble sort:
//        for(int i = 0; i < ar.length; i++){
//            for(int j = 1; j< ar.length-i; j++){
//                if(ar[j-1] > ar[j]){
//                   temp = ar[j-1];
//                   ar[j-1] = ar[j];
//                   ar[j] = temp;
//                }
//
//            }
//        }

    //Insertion sort:

//        for (int i = 1; i < ar.length; i++) {
//            for(int j = i ; j > 0 ; j--){
//                if(ar[j] < ar[j-1]){
//                    temp = ar[j];
//                    ar[j] = ar[j-1];
//                    ar[j-1] = temp;
//                }
//            }
//        }

    //Selection sort:
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = i + 1; j < ar.length; j++) {
//                    if (ar[i] > ar[j]) {
//                    temp = ar[i];
//                    ar[i] = ar[j];
//                    ar[j] = temp;
//                }
//            }
//        }

    //Quick sort:
//        quickSort(ar, 0, ar.length-1);

    //Merge sort:



//        System.out.println();
//
//        for(int s : ar){
//        System.out.print(s + " ");
//    }
//}


    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }

    //In-progress
    public static void mergeSort(int [] list, int low, int high){
        if(low == high){
            return;
        }else{
            int mid = (low + high)/2;
            mergeSort(list, low, mid);
            mergeSort(list, mid+1, high);
        }
    }
}





