package com.sweety.automation;

import java.util.ArrayList;

/**
 * Created by skumari on 2/2/2018.
 */
public class AAddArrayList {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sweety"); //Add element
        list.add("Kiara");
        list.add("Rajat");
        list.add("Mona");
        list.add("Myra");
        list.add("Vinit");
        list.remove(3); //Remove at the specified index
        list.remove("Sweety"); //remove element
        System.out.println(list.size());
        list.set(1, "Rajju"); //Change Rajat to Rajju
        System.out.println(list.size()); //Size is still 4
        System.out.println(list.isEmpty()); //list is not empty
        System.out.println(list.contains("Kiara")); //true
        for (String obj : list) {
            System.out.println(obj);
        }
        list.clear();
        System.out.println(list.isEmpty()); //Now list is empty

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        System.out.println(list1.equals(list2)); //true
        list1.add("a");
        System.out.println(list1.equals(list2)); //false
        list2.add("a");
        System.out.println(list1.equals(list2)); //true
        list1.add("b"); //[a,b]
        list2.add(0,"b"); //[b,a]
        System.out.println(list1.equals(list2)); //false

    }
}
