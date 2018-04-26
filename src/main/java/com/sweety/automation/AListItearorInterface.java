package com.sweety.automation;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by skumari on 2/20/2018.
 */
public class AListItearorInterface {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Kumar");
        list.add("java");
        list.add("world");
        System.out.println(list.get(2));
        ListIterator<String> itr = list.listIterator();
        System.out.println("Traversing the element in forward direction");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Traversing element in backward direction");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }


    }
}
