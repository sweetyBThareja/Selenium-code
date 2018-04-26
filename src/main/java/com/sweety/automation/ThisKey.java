package com.sweety.automation;

/**
 * Created by skumari on 1/17/2018.
 */

public class ThisKey{
    static String name;
    int age;
    int fee;

    ThisKey(String name, int age){
        this.name = name; //refer instance variable
        this.age = age;
    }

    ThisKey(String name, int age, int fee){
        this(name, age); //invoke current class constructor -- constructor chaining
        this.fee = fee;
    }

    public void m(ThisKey obj){
        System.out.println("Method is invoked");
    }


    public void details(){
        m(this); //pass as an argument in the method
        System.out.println("Hello I am new student");
    }
    static void mstatic(){
        System.out.println("I am static method");
    }

    public void showData(){
        this.mstatic();
        System.out.println("Name is " + name + " and age is " + age + " fee is " + fee);
        this.details();//invoke current class method
    }

    public static void main(String args[]){
        ThisKey obj = new ThisKey("Ankit",2,10000);
        obj.showData();
        ThisKey obj1 = new ThisKey("Rakesh", 4,20000);
        obj1.showData();

    }

}



