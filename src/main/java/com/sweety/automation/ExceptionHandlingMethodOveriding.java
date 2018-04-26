package com.sweety.automation;

import java.io.IOException;

/**
 * Created by skumari on 2/12/2018.
 */
public class ExceptionHandlingMethodOveriding extends ExceptionHandlingA{
//    void msg()throws IOException{ //Overridden method doesn't thrown checked exception.
//        System.out.println("I am child class overridden method");
//    }

    void msg()throws ArithmeticException{
        System.out.println("I am child class overridden method");
    }

//    void details(){
//        System.out.println("Sub class overridden method does not declare any exception");
//    }

    void details() throws ArithmeticException{
        System.out.println("Sub class overridden method can declare same exception");
    }

//    void details() throws Exception{ //Not allowed -- Overridden method can not declare parent exception i.e. ArithmeticException -> parent -> Exception
//        System.out.println("Sub class overridden method can declare same exception");
//    }

    public static void main(String args[]){
        ExceptionHandlingA obj = new ExceptionHandlingMethodOveriding();
        obj.msg();
        obj.details();
    }

}
