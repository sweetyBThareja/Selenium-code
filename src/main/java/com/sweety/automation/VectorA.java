package com.sweety.automation;

import java.util.Enumeration;
import java.util.Vector;

public class VectorA {
    public static void main(String args[]){
        Vector<String> list = new Vector<>();
        list.add("abc");
        list.addElement("sweety");
        list.add("rajju");
        Enumeration e = list.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
