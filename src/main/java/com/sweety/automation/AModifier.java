package com.sweety.automation;

/**
 * Created by skumari on 1/19/2018.
 */
public class AModifier{
  /*  private int data = 40;
    private void showData(){
       System.out.println("private modifier");
    } */

    protected int data = 50; //within same package
    protected void showData(){
        System.out.println("protected modifier");
    }
}

