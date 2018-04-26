package com.sweety.automation;

import java.io.IOException;

/**
 * Created by skumari on 2/12/2018.
 */
public class ExceptionHandlingA {
    void msg(){
        System.out.println("I am parent");
    }

    void details()throws ArithmeticException{
        System.out.println("I am parent class method declare exception");

    }

}
