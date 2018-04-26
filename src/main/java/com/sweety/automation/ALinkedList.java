package com.sweety.automation;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by skumari on 2/19/2018.
 */
public class ALinkedList {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("java");
        list.add("world");
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator<Integer> irr = li.iterator();
        while(irr.hasNext()){
            System.out.println(irr.next());
        }


    }
}
