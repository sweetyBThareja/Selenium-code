package com.sweety.automation;

import java.util.*;

/**
 * Created by skumari on 2/1/2018.
 */
public class AArrayList {
    public static void main(String args[]){
        List<String> list = new ArrayList<String>(); //Creating ArrayList
        list.add("Rajat");//Adding objects in arrayList
        list.add("Kiara");
        list.add("Myra");
        list.add("Mona");
        Iterator itr = list.iterator(); //Traversing arrayList through iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Traversing through for-each loop");
        for(String obj: list){
            System.out.println(obj);
        }


    }
}
