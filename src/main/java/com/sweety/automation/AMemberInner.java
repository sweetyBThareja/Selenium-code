package com.sweety.automation;

/**
 * Created by skumari on 2/20/2018.
 */
public class AMemberInner {
    private int i = 10;
    class Inner{ //memberInner class
        public void details(){
            System.out.println("Hello World");
        }
    }
    public static void main(String args[]){
        AMemberInner obj = new AMemberInner();
        AMemberInner.Inner obj1 = obj.new Inner(); //Instance of Inner class is created inside the instance of outer class
        obj1.details();
    }
}
