package com.sweety.automation;

/**
 * Created by skumari on 1/25/2018.
 */
interface OldInterface{
    public void existingMethod();
    default public void newDefaultMethod() {
        System.out.println("I am new default method");
    }

}
public class DefaultInterface implements OldInterface {
    public void existingMethod(){
    System.out.println("I am existing method");
    }

    public static void main(String args[]){
        DefaultInterface obj = new DefaultInterface();
        obj.newDefaultMethod();
    }
}
