package com.java;

/**
 * Created by skumari on 3/8/2018.
 */
interface y{
    int i = 30;
    public default int m(){
        System.out.println("I am default method");
        return 1;
    }
}
public class SingleInheritance implements y{

//    public int m(int a){
//        return 2;
//    }
     int a = 10;
    public void sum(int w){
        System.out.println(a);
    }

//    public void child(){
//        System.out.println("I am child class method only");
//    }
//    int a = 10;
//    {System.out.println("I am base class instance block");}
  //  static{System.out.println("I am base class static block");}
//    public SingleInheritance(){
//        System.out.println("I am base class default constructor");
//    }
//
//    public SingleInheritance(int d){
//        a = d;
//        System.out.println("I am base class parameterized constructor");
//    }
//    protected static void n(){
//        System.out.println("I am base class static method");
//    }

//    protected void m(){
//        System.out.println("I am base class method");
//        System.out.println("10");
//    }

}
