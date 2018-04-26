package com.java.automation;

/**
 * Created by skumari on 1/19/2018.
 */
public class APublic {
    public int data = 70;
    public void showData(){
        System.out.println("I am public");
    }

    void show(){
        System.out.println("I am default not accessible in other package");
    }
}
