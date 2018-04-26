package com.sweety.automation;

/**
 * Created by skumari on 2/6/2018.
 */
public class AToStringMethod {
    String name;
    int age;
    int roll;

    AToStringMethod(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    public String toString(){ //override toString() method
        return name + " " + age + " " + roll;
    }

    public static void main(String args[]){
        AToStringMethod obj = new AToStringMethod("Ram", 23, 1);
        AToStringMethod obj1 = new AToStringMethod("Shyam", 24, 2);
        System.out.println(obj);
        System.out.println(obj1);
    }
}
