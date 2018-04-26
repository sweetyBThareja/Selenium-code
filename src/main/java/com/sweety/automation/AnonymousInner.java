package com.sweety.automation;

/**
 * Created by skumari on 2/20/2018.
 */
interface Eatable {
    void eat();

}

public class AnonymousInner {
    public static void main(String args[]) {
        Eatable obj = new Eatable() {

            public void eat() {
                System.out.println("I am Anonymous Inner class");
            }
        };
        obj.eat();
    }
}
