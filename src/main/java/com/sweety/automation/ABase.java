package com.sweety.automation;

/**
 * Created by skumari on 1/24/2018.
 */
public class ABase {
    public int data = 30;
    public void basemethod(){
        System.out.println("I am only base method");
    }
    //{System.out.println("Base");}
//    public ABase(){
//        System.out.println("I am base class constructor");
//    }
    protected void showDetails() {
        System.out.println("Hi I am base class");
    }
}
