package com.sweety.automation;

/**
 * Created by skumari on 2/13/2018.
 */
public class ExceptionHandlingExample {
//    static{
//        int i[] = {1,2,3,4,5};
//        int num = i[-1]; //ExceptionInInitializerError
//
//    }

    String name;
    public void printLength()throws NullPointerException{
        try{
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println("caught");
        }

    }
    public static void main(String args[]){
        ExceptionHandlingExample obj = new ExceptionHandlingExample();
        obj.printLength();
    }
}
