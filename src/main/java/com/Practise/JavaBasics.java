package com.Practise;

import java.util.*;

public class JavaBasics {

    public static void main(String args[]){
        //create * pyramid

//        for(int i = 1; i <=5; i++){
//            for(int j = 1; j<=i ; j++){
//               System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = 1; i <=5; i++){
//            for(int j = i; j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //fibonacci:

//        int a = 0;
//        int b = 1;
//        System.out.print(a);
//        System.out.print(b);
//        for(int i =0; i< 7; i++){
//            int c = a + b;
//            a = b;
//            b = c;
//            System.out.print(c);
//        }

        //factorial:
//        int n = 5;
//        for(int i=1; i<5;i++){
//            n=n*i;
//        }
//        System.out.println(n);

        //using recursion:
//        System.out.println(fact(5));

        //Palindrome: reverse and compare
//        int n = 12321;
//        int temp = n;
//        int r, sum =0;
//        while(n>0){
//            r = n%10;
//            sum = (sum*10)+r;
//            n=n/10;
//        }
//        if(sum==temp){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not palindrome");
//        }

        //Sorting, minimum, maximum
//        int a [] = {23,12,32,11,24,56};
//        int temp;

//        for(int i =0; i < a.length; i++){
//            for(int j = i+1; j  < a.length; j++){
//                if(a[i] > a[j]){
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//            }
//        int max = a[0];
//        for(int i=0; i<a.length; i++){
//            if(a[i]> max){
//                max=a[i];
//            }
//        }
//        int min = a[0];
//        for(int i = 0; i<a.length; i++){
//            if(a[i] < min){
//                min = a[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//        for(int i=0; i<a.length; i++){
//            System.out.print(a[i] + " ");
//        }

        //Searching: Linear serach, binary search
//        int key = 23;
//        for(int i =0; i< a.length; i++){
//            if(a[i]== key){
//                System.out.println("key found at index " + i);
//            }
//        }

//        Arrays.sort(a);
//        for(int i=0; i<a.length; i++){
//            System.out.print(a[i] + " ");
//        }
        //Binary search
//        int result = binarySearch(a, 0, a.length, 23);
//        int result = binarySearchRecursion(a, 0, a.length-1, 23);
//        if(result == -1){
//            System.out.println("Element not found");
//        }else{
//            System.out.println("Element found " + result);
//        }

        //reverse an array:
        //Without reversing:
//        for(int i=0; i< a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        //After reverse:
//        System.out.println();
//        for(int i = 0; i<a.length/2; i++){
//            temp = a[i];
//            a[i] = a[a.length-(i+1)];
//            a[a.length-(i+1)] = temp;
//        }
//       for(int i=0; i< a.length; i++) {
//           System.out.print(a[i] + " ");
//       }

        //insert an element in array:
//        int key = 10;
//        int [] b = new int[a.length+1];
//        int index = 2;
//        System.arraycopy(a, 0, b, 0, a.length);
//        for(int i=0; i<b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//        System.out.println();
//        b[index] = 35;
//        System.arraycopy(a, index, b, index+1, a.length-index);
//        for(int i=0; i<b.length; i++) {
//            System.out.print(b[i] + " ");
//        }

        //Merge two array:
//        int [] b = {21, 45, 76, 34,87};
//        int c[] = new int[a.length + b.length];
//        System.arraycopy(a, 0, c, 0, a.length);
//        for(int i=0; i< c.length; i++){
//            System.out.print(c[i] + " ");
//        }
//        System.out.println();
//        System.arraycopy(b, 0, c, a.length, c.length-a.length);
//        for(int i=0; i< c.length; i++){
//            System.out.print(c[i] + " ");
//        }

        //Remove an element from array or arraylist:
//        int [] arr = {12,1,32,4,5,67};
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

        //Common elements in 2 arrays:
//        int[] ar = {1, 2, 4, 5, 43, 21, 3};
//        int[] arr = {41, 22, 4, 35, 3, 51};
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (ar[i] == arr[j]) {
//                    System.out.println("Common Elements in array is " + ar[i]);
//                }
//            }
//        }
////        //For 3 arrays:
//        int [] arrr = {1, 2, 4, 5, 35, 3, 51};
//        Arrays.sort(ar);
//        Arrays.sort(arr);
//        Arrays.sort(arrr);
//        int x = 0, y = 0, z = 0;
//        while (x<ar.length && y < arr.length && z < arrr.length){
//            if(ar[x] == arr[y] && arr[y] == arrr[z]){
//                System.out.println("Common elements in 3 arrays " + ar[x]);
//                x++;
//                y++;
//                z++;
//            }else if(ar[x] < arr[y]){
//                x++;
//            }else if(arr[y] < arrr[z]){
//                y++;
//            }
//            else{
//                z++;
//            }
//        }

//Sum of the arrays value:
//        int []a = {1,4,2,3,46,32};
//        int sum=0;
//        double avg = 0.0;
//        for(int i = 0; i< a.length; i++){
//            sum = sum + a[i];
//            avg = sum/(a.length);
//        }
//      System.out.println(sum);
//      System.out.println(avg);

        //Remove duplicate elements in array:
//        int [] a = {2,3,4,21,43,54,34,4,43, 4};
//        Arrays.sort(a);
//        int index = 0;
//        int count = 1;
////        for(int i =1; i< a.length; i++){
////            if(a[i-1] == a[i]){
////                System.out.println("Duplicate elements in array " + a[i]);
////                count++;
////                System.out.println("count of element " + a[i] + " = " + count);
////              index = i;
////            }
////            count = 0;
////        }
//        int count1 = 0;
//        int[] temp = new int[a.length];
//        for(int i = 0; i < a.length-1; i++){
//            if(a[i] != a[i+1]){
//                temp[count1++] = a[i];
//            }
//        }
//
//        temp[count1++] = a[a.length-1];
//        for(int j =0; j<count1; j++){
//            System.out.print(temp[j] + " ");
//        }

//      //or without sorting:
//        for(int i=0; i < a.length; i++){
//            for(int j = i+1; j < a.length; j++){
//                if(a[i] == a[j]){
//                    System.out.println("duplicate elements " + a[i]);
//                }
//            }
//        }

 //Array to arraylist and arraylist to array:
//        int [] a = {2,34,5,23,52,61,21,1};
//        List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
//        String [] str = {"hello", "java", "jee", "jdk"};
//        List<String> list = new ArrayList<>(Arrays.asList(str));
//        list.add("hiii");
//        list.add("good");
//        for(String a : list){
//            System.out.println(a);
//        }
//        String [] str1 = new String[list.size()];
//        list.toArray(str1);
//        for(String s : list){
//            System.out.print(s + " ");
//        }

        //move all the zeros at the end of array:
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

//String related:
        //duplicateWords("Bread butter and bread");

//        String strr = "Bread butter and bread";
//        int count = 1;
//        for(int i = 0; i < strr.length(); i++){
//            if((strr.charAt(i)== ' ') && (strr.charAt(i + 1) != ' ')){
//                count++;
//            }
//        }
//      System.out.println("Number of words in a string " + count);
//
        int num = 0;

        int ar[] = new int[3];
        int count3 = 0;
        int m = 0;
        for(int i=123; i<124; i++){
           int  n = i;
           m = i;
            while(n>0) {
                num = n % 10;
                System.out.println("remainder "+ num);
                n = n / 10;
                System.out.println("Remaining number: " + n);
                ar[count3++] = num;
            }}


//        System.out.println("Elements in Array:");
//        for(int i4 = 0; i4<3; i4++){
//            System.out.print(ar[i4] + " ");
//        }
            for (int i2 = 0; i2 < 3; i2++) {
                for (int j = 1; j < i2+1; j++) {
                    if (ar[i2] > ar[j]) {
                        System.out.println(m + " Number is valuable");
                    } else {
                        System.out.println(m + " Number is not valuable");
                    }
                }
            }


    }

    public static void duplicateWords(String str){
        String [] st = str.split(" ");
        System.out.println("Number of words in String " + st.length);
        HashMap<String, Integer> wordCount = new HashMap<>();
        for(String word : st){
            if(wordCount.containsKey(word.toLowerCase())){
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            }else {
                wordCount.put(word.toLowerCase(), 1);
            }
        }

        Set<String> wordsInString = wordCount.keySet();
        for(String word : wordsInString){
            if(wordCount.get(word) > 1){
                System.out.println("Duplicate words : " + word + ":" + wordCount.get(word));
            }
        }
    }
//   public static int binarySearch(int []a, int first, int last, int key){
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

//    public static int binarySearchRecursion(int []a, int first, int last, int key){
//        if(last>=first){
//            int mid = (first +(last - first))/2;
//            if(a[mid] == key){
//                return mid;
//            }
//            if(a[mid] < key){
//               return binarySearchRecursion(a, mid+1, last, 23);
//            }else {
//              return  binarySearchRecursion(a, 0, mid-1, 23);
//            }
//        }
//
//        return -1;
//    }


//    public static int fact(int n){
//        if(n==0){
//            return 1;
//        }else{
//            return n*fact((n-1));
//        }
//    }


}
