package com.java;

public class YetMoreInitializationOrder {

    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    YetMoreInitializationOrder() { add(5); }
    static { new YetMoreInitializationOrder(); }
    static { add(4); }
    { add(6); }
    { add(8); }
    public static void main(String[] args) throws Exception {
        {throw new Exception();}
    }

//    static {
//        if (true) throw new Exception();
//    }

}

