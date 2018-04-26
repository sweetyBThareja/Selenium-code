package com.sweety.automation;

/**
 * Created by skumari on 2/20/2018.
 */
//interface A{
//    void show();
//    interface B{
//      void msg();
//    }
//}
//public class ANestedInterface implements A.B{
//    public void msg(){
//        System.out.println("I am nested interface within another interface");
//    }
//
//    public static void main(String args[]){
//    A.B obj = new ANestedInterface();
//        obj.msg();
//    }
//
//}

//Interface within class:
class A{
    interface C{
        void data();
    }
}

class ANestedInterface implements A.C{
    public void data(){
        System.out.println("I am nested interface within class");
    }
    public static void main(String args[]){
    A.C obj = new ANestedInterface();
        obj.data();
    }
}
