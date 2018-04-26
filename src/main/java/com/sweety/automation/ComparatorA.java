package com.sweety.automation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class ComparatorA {
    public static void main(String args[]){
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "Kiara"));
        list.add(new Student1(2, "Rajat"));
    }
//    Collections.
//    for(Student1 s1 : list){
//
//    }
}

class Student1 implements Comparator<Student1>{
    int age;
    String name;
    public Student1(){

    }

    public Student1(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int compare(Student1 ob, Student1 ob1){
        Student1 s1 = ob;
        Student1 s2 = ob1;
        return s1.name.compareTo(s2.name);
    }
}