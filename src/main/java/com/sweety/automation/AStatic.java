package com.sweety.automation;

/**
 * Created by skumari on 1/17/2018.
 */
public class AStatic {
    public static int count = 1;

    static{System.out.println("hello I am static block");}

    public static void employeeCount(){
        System.out.println(AStatic.count);
        System.out.println("Total number of employees are " + count);
        count = count+1;
    }

    public static void main(String args[]){
        employeeCount(); //calling static method from static main.
        AStatic.employeeCount();
        AStatic obj = new AStatic(); //We can also call by creating instance
        AStatic obj1 = new AStatic();
        obj.count = 5;
        obj1.count = 7;
        System.out.println(obj1.count);

    }
}