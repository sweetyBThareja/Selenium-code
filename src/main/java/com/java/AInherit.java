package com.java;

import com.sweety.automation.ASingleInheritance;

/**
 * Created by skumari on 4/1/2018.
 */
interface Ad {
        default void hello(){
        System.out.println("hello");
    }

    static int ja(){
        System.out.println("I am interface static method");
        return 1;
    }
        }
interface Bd extends Ad{
//    default void hello(){
//    //super.hello();
//    Ad.super.hello();
//    }
    static int ja(){
        System.out.println("I am interface static method");
        return 2;
    }
}
public class AInherit extends BI implements Bd{
   public static int ja(){
        return 3;
    }

    public static void mq(){
        System.out.println("I am child class method");
    }
    public void hello(){

    }
    public static void main(String args[]){
        AInherit obj = new AInherit();
        System.out.println(Ad.ja());
        System.out.println(Ad.ja());
        obj.mq();
        System.out.println();
//        System.out.println(obj.x);
//        System.out.println(((AI)obj).i);
    }
}

class AI{
    AI(int a){
        System.err.print("kddkf");
    }
    int i = 10;
    int x = 23;
}

class BI extends AI{
    BI(){
        //this(10);
        super(10);
    }
    BI(int a){
        super(20);
    }
    int i = 20;
    public static int ja(){
        return 7;
    }
    public static void mq(){
        System.out.println("I am parent class method");
    }
}

