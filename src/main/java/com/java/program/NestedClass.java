package com.java.program;

class A{
    private int a = 10;
    static final int i = 10;

    //static{i = 10;}
    {System.out.println("dfgfg");}
    public static void main(String ... String) {
        int a, b =100;
        float f = 1.0F;
        A obj =  new A();


//        B b = new B();
//        A a = b;
//        C c = (C) a;

        //a = 20;
    }
}

class B extends A{}

class C extends B{}

