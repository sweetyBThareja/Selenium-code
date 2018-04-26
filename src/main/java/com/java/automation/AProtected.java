package com.java.automation;

/**
 * Created by skumari on 1/19/2018.
 */
public class AProtected {
    public AProtected(){System.out.println("I am default base class constructor");}
    public void basemethod(){
        System.out.println("I am only base method");
    }
    protected int data = 60;
    protected void showData(){
        System.out.println("protected modifier in different package");
    }
}
