package com.java;

interface yw{
    int i = 34;
    int c = 45;
    public default int m(){
        System.out.println("I am default method new");
        return 1;
    }
}
interface aa {
    int i = 20;
    int x = 23;

    public default int m() {
        System.out.println("I am default interface method");
        return 1;
    }
}

interface ba extends aa {
    int m();
}

public class NewInherit extends SingleInheritance implements ba, yw {
    int i = 22;
    //    int a;
    int a = 12;

    public int m() {
        super.m();
        System.out.println("I am implemented method");
        return 2;
    }

    public static void main(String args[]) {
        NewInherit obj = new NewInherit();
        yw objw = new NewInherit();
//        System.out.println(obj instanceof NewInherit);
//        System.out.println(objw instanceof NewInherit);
//        System.out.println(obj instanceof SingleInheritance);
//        System.out.println('a' % 2);

        System.out.println(objw.i);
        aa obj1 = (aa)new NewInherit();
        SingleInheritance obj2 = new SingleInheritance();
//        System.out.println(obj1.m());
        System.out.println(obj.c);
//        System.out.println(obj2.m());
//        System.out.println(obj.m());
        System.out.println(((yw) obj).i);
        System.out.println(obj1.i);
        System.out.println(obj.i);
        System.out.println(obj2.i);
        System.out.println(obj.x);
//        System.out.println(objw.x);//compile error
        System.out.println(((NewInherit)objw).x);//compile error
    }
}
