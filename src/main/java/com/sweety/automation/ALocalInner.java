package com.sweety.automation;

/**
 * Created by skumari on 2/20/2018.
 */
public class ALocalInner {
    private int i = 30;

    public void details() {
        class LocalInner {
            public void show() {
                System.out.println("I am local inner class");
            }
        }
        LocalInner obj1 = new LocalInner();
        obj1.show();
    }

    public static void main(String args[]) {
        ALocalInner obj = new ALocalInner();
        obj.details();
    }
}
