package com.sweety.automation;

/**
 * Created by skumari on 2/9/2018.
 */
public class AExceptionPropagation {

    void n() {
        int i = 10 / 0;
    }

    void m() {
        n();
    }

    void p() {
        try {
            m();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String args[]) {
        AExceptionPropagation obj = new AExceptionPropagation();
        obj.p();
        System.out.println("Normal flow is maintained");
    }
}
