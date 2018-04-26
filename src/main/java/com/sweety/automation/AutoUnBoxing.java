package com.sweety.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by skumari on 2/2/2018.
 */
public class AutoUnBoxing {

    public static int sumOfOddNumbers(List<Integer> list){
        int sum = 0;
        for(Integer i : list){
            if(i % 2!=0){
                sum = sum+i;
                /* unboxing of i is done automatically
               using int value implicitly
            if(i.intValue() % 2 != 0)
                sum += i.intValue();*/
            }

        }
      return sum;
    }

    public static void main(String args[]){
        /* Here we are creating a list of elements
           of Integer type and adding the int primitives
           type values to the list*/
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<10; i++){
            list.add(i);
        }
       int sumOdd =  sumOfOddNumbers(list);
        System.out.println("Sum of the odd numbers are " + sumOdd);

        ArrayList<Object> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Pineapple");
        fruitList.add("Guava");
        System.out.println("Converting ArrayList to array");
        String[] item = fruitList.toArray(new String[fruitList.size()]);
        for(String s : item ){
            System.out.println(s);
        }

     System.out.println("Converting Array to ArrayList");
        List<String> l2 = new ArrayList<>();
        l2 = Arrays.asList(item);
        System.out.println(l2);
    }

}
