package com.sweety.automation;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by skumari on 2/20/2018.
 */
public class AHashSet {
    public static void main(String args[]){
        HashSet<String> list = new HashSet<String>(); //Creating HashSet
        list.add("Rajat");//Adding objects in arrayList
        list.add("Kiara");
        list.add("Myra");
        list.add("Mona");
        Iterator itr = list.iterator(); //Traversing HashSet through iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Traversing through for-each loop");
        for(String obj: list){
            System.out.println(obj);
        }


    }
}
