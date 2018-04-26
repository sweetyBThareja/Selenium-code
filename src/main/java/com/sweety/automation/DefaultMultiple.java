package com.sweety.automation;

/**
 * Created by skumari on 1/25/2018.
 */
interface AFirstInterface {
    default public void show() { //default interface method
        System.out.println("I am first interface");
    }
    static int showDetail(){ //Static Interface method
       return 10;
    }
}

interface ASecondInterface {
    default public void show() {
        System.out.println("I am second interface");
    }
}

public class DefaultMultiple implements AFirstInterface, ASecondInterface {
    public void show() {
        System.out.println("I am overridden method");
    }

    public static void main(String args[]) {
        DefaultMultiple obj = new DefaultMultiple();
        obj.show();
        System.out.println(AFirstInterface.showDetail());
    }
}
