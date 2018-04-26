package com.sweety.automation;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableA {
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(13, "Rajat", 3));
        list.add(new Student(12, "Sweety", 2));
        list.add(new Student(1, "Kiara", 1));


        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.age + " " + s.name + " " + s.roll);

        }
    }

}

class Student implements Comparable<Student>{
    int age;
    String name;
    int roll;

    public Student(int age, String name, int roll){
        this.age = age;
        this.name = name;
        this.roll = roll;
    }
    public int compareTo(Student s){
        if(age == s.age){
            return 0;
        }else if(age > s.age){
            return 1;
        }else {
            return -1;
        }
    }

//    public int compareTo(Student s){
//        if(roll == s.roll){
//            return 0;
//        }else if(roll > s.roll) {
//            return 1;
//        }else {
//            return -1;
//        }
//    }

}
