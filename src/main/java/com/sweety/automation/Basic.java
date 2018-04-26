package com.sweety.automation;

/**
 * Created by skumari on 1/2/2018.
 */
public class Basic {

    public void localVar(){
        int age = 0;
        age = age + 10;
        System.out.println("Age of X is = " + age);
    }
    public static void main(String args[]) {
        System.out.println("Java Basics");
        Basic obj = new Basic();
        obj.localVar();

        Employee empOne = new Employee("Hansika", 1000);
        empOne.showDetails();
        empOne.totalEmployees();
        Employee empTwo = new Employee("Radhika", 2000);
        empTwo.showDetails();
        empTwo.totalEmployees();

        //Variables
    }
    // type conversion and type casting
}
