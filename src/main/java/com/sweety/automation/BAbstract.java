package com.sweety.automation;

/**
 * Created by skumari on 1/24/2018.
 */
public class BAbstract extends AAbstract {
    public void run(){
        System.out.println("Running safely");
    }
    public static void main(String args[]){
        AAbstract obj = new BAbstract();
        obj.run();
    }
}
