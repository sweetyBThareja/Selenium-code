package com.java;
//import java.lang.*;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
//import org.apache.xpath.operations.Bool;

import java.util.*;

/**
 * Created by skumari on 2/28/2018.
 */
interface A {
    default void m() {
        System.out.println("I am default method");
    }
}

class ProgramEssential extends BaseA implements A {
    int i = 20;
    public void m(){
        System.out.println("I m overriding method");
    }
//    static {
//        throw new ArithmeticException();
//        //if(true)throw new NullPointerException();
//    }

    //   {throw new ArithmeticException();}
//    static final int j;
//    //j = 17;
//    static{j = 9;}
//    final int i;
//    ProgramEssential(){
//        i = 10;
//        //j = 10; -- invalid
//    }
//     ProgramEssential(int u){
//         i = 20;
//     }

    //{i = 40;}
//    public static int i = n(20);
//    int x = n(30);
//    {System.out.println("I am instance initializer block");}
//    static {System.out.println("I am static block");}
//    static String s = null;
//public ProgramEssential();
//    private ProgramEssential(){
//
//    };

//    abstract ProgramEssential(int a){
//
//    }
//    ProgramEssential(int a){
//    System.out.println("a");
//    }

//    public static int n(int n){
//        i = n;
//        System.out.println(i);
//        return i;
//        //{System.out.println("egtrg");}
//    };
//    public void mn(){
//        System.out.println(i);
//    }

    //String s(){
    //  return "good morning";
    //}

//Object obj = new String[]{"aa", "f"};
//    static int f = 5;
////    int d, u;
//    final static private double d = 3.12223444;
//    final Object [] ob = {null};
//    double a = 1000.0;
//    public ProgramEssential(){
//      d = u =0;
//    }
//
//    public static void derive(){
//        System.out.println("derive");
//    }
//
//    public static void a(){
//        System.out.println("vvvv");
//    }
//
//    public static void a(int a, int b){
//        System.out.println("gfvgtt");
//    }
//
//
//      public void m(){
//        super.m();
//        System.out.println("I am overridden method");
//        ProgramEssential obj1, obj2 = new ProgramEssential();
//          obj2.m(); //can create object in any method and can give reference more than one also
//          obj2.m();
//    }
//
//    public int a(String str){
//        return (int) Math.round(Double.parseDouble(str.substring(1, str.length()-1)));
//    }
//
//    public void bitWise(){
//        int a = 60;
//        int b = 30;
//        int c;
//        c = ~b;
//        System.out.println("Negation of a" + ~a);
//        System.out.println("Negation of a" + c);
//        c = a & b;
//        System.out.println("a & b " + c);
//        c = a | b;
//        System.out.println("a & b " + c);
//    }


//public void newMethod(int i, double d, Object op){
//
//}
//    static String str = "http://www.google.com";
//    public static ProgramEssential ur(){
//        return null;
//    }

//    public Arrays a(){
//        return (int[] a);
//    }
//{i = 30;}
//

//public static int cube(int num){
//    return num*num*num;
//}
//
    public void doA(int a){
        try{
        for(int i = 0; i <10; i++){
            if(i==a) throw new Exception("Index of a is : " + i);
        }}catch(Exception e){
        System.out.println("caught");
    }}

    public void doB(boolean f){
        if(f){
//            try {
                doA(15);
//            }catch(Exception e){
//                System.out.println("I am catched");
//            }
            doC(3);
        }else{
            return;
        }
    }

    public void doC(int a){
        try {
            throw new ArithmeticException();
        }catch(ArithmeticException e){
            System.out.println("caught");
//            throw new NullPointerException();
            }catch(NullPointerException e){
            System.out.println("nullpointerexception");
        }
        }

    //public int excep(){
//        try{
//            int i = 10/0;
//        }catch(ArithmeticException e){
//            System.out.println("caught");
//            return 3;
//        }finally{
//            return 5;
//        }
//    }
//    int i  =10;
//    public void rm(int a){
//        this.i = a;
//        a = this.i;
//    }

//    public void am(int a){
//        System.out.println("int");
//    }

//    public void am(float a){
//        System.out.println("float");
//    }

//    public void am(long a){
//        System.out.println("long");
//    }

//    public void am(short a){
//        System.out.println("In short");
//    }
//
//
//    public void am(Integer a){
//        System.out.println("Integer");
//    }
//
//    public void am(int... a){
//        System.out.println("vararg");
//    }
    public static void main(String... $args) {
//        System.out.println(4> 2? "abc" + "jjh" : " " + "cdf" + "bgc");
//        System.out.println(3>5 ? null : " " + "cdf" + "bgc");
//        int i = 'e';
//        float f = 'g';
//        System.out.println(false+"abc");
//        ProgramEssential ob = new ProgramEssential();
//        ob.i = 30;
//        this.i = 40;
//        String ss = "abcd";
//        System.out.println(ss.substring(1,4));
//        String d = "";
//        System.out.println(d.equals(""));
//        ob.am(1);
//        Integer b = new Integer(5);
//        ob.am(b);
//        ob.am(1);
//        ob.am(1);
//        ob.am(1);
//        Short s = new Short("1");
//        Byte b = new Byte("128");
//        Character c = new Character(4);
//        Integer i = new Integer("12");
//        Integer.valueOf(i);
//        Integer ei = new Integer(s);
//        Long ll = new Long(null);
//        Float fl = new Float(1.0);
//        Double dl = new Double("1.02");
//        Boolean bl = new Boolean(true);
//        System.out.println(i);
//        System.out.println(63e-1);
//        int k = 1;
//        k += k = 4 * (k + 2);
//        System.out.println(k);

        // System.out.print(5/0);

//        String s3 = "Ja";
//        s3 += "va";
//        System.out.println(s3 == "Java");
//
//        String s;
//        s = "Ja" + "va";
//
//        System.out.println(s == "Java");
//
//        for(int i = 0; i<3;){
//            i++;
//            System.out.println("f");
//            System.out.println("g");}

//        String s1 = "Java";
//        String s2 = "Java";
//        StringBuilder sb1 = new StringBuilder("java");
//        System.out.println(sb1.toString() == s1);
//
//        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
//        list.add(array[0]);
//        list.add(array[2]);
        list.add(1);
        list.add(null);


//        A itf = new ProgramEssential();
//        itf.m();
//        String s = "hello";
//        System.out.println("hello" == s);
//        String dd = "1234";
//        dd+="t";
//        System.out.print(dd);
//        Object[][][] cubbies = new Object[3][0][5];
//        System.out.println(cubbies[1][0][1]);
       // StringBuilder v = "jkjfr";
       // System.out.println(dd.substring(4,1));

//        Integer i1 = new Integer(1);
//        Integer i2 = i1;
//        int i3 = 1;
//        System.out.println(i1 == i2);
//        short a = 10;
//        short b = 20;
//        short c = (short) (a + b);
//        for(int i=0; i<10 ; ) {
//             i = i++;
//             System.out.println("Hello World");
//             }

//        ProgramEssential obj = null;
//        obj.cube(45);
//        ProgramEssential obj = new ProgramEssential();
//        obj.doC(23);
//        try{
//        obj.doB($args.length > 0);
//        }
//        catch(Exception e){System.out.println("caught");
//        }

//        int a = 0b10;
//        int b = 0xE;
//        System.out.println(b);
//        double d = 0x2;
//        System.out.println(d);
//        float f = 0x1;
////        short s = 5;
////        System.out.println(s.length());
//        int k = 11;
//        System.out.println(k > 4 ? "a" : 1);
//        long x = 10L;
//        int y = (int)(2*x);

//        int iw = 20;
//        String ss = "hello";
//        Long l = new Long(ss);
//        Long wwl = new Long(l);
//        System.out.print(iw);
//        Long wl = new Long(1);
//        char c = 4546;
//        int i = 0;
//        Character cc = new Character(c);
//        System.out.println(cc);


//        Float f = new Float(10.2);
//        System.out.print(f);
//        Integer i = new Integer(10);
//        ArrayList<Double> list = new ArrayList<>();
//        list.add(1.0);
//        System.out.println(list.contains('e'));
//        list.indexOf('r');
//        System.out.println(list.indexOf('r'));
        //{throw new ArithmeticException();}
//        short sq =1;
//        byte b = 2;
//        Byte yq = 5;
//        char f = 'z';
//        int iq = sq;
//        int re = b;
//        int a = yq;
//        int u = re;
//        System.out.println(u);
//        int y = 'w';
//        Integer k = new Integer("3");
//        StringBuffer ss = new StringBuffer("hello");
//        ss.toString();
//        String sw = "hello";
//        System.out.println(ss.equals(sw));
        //double s = 1;
        //int i = 1;
        //char c = i;
        //System.out.println(s == i);
        //System.out.println(ss == sw); -- compile error
        //System.out.println(cube(a));
//        String er = new String("hello");
//        System.out.println(sw == er);
//        System.out.println(sw.equals(er));

//        float f = 10.2f;
//        double d = f;
//        float g = (float)d;
        //System.out.println(null + null);
//        int [][]arr = new int[3][]{1,2,3,4};
//        int [][]arr = new int[3][];
//        System.out.println(arr[0][0]);

//        int [] de = new int[2];
//        //String [] de = new String[2];
//        System.out.println(de[0]);
//        int [] a = null;
//        System.out.print(a.length);

//       final int k;
//        int y;
        //{k = 15;}
//        k = 16;
//        System.out.println(k);
//        y = 20;
//        y = 34;

//        String s = null;
//        int a [] = null;
//        System.out.println(a[0]);
//        System.out.println(s.length());
//        ArrayList<Integer> list = new ArrayList<>();
//        abstract int num1  = 4;
//        System.out.println(num1 | 12);
        // String url = "http://www.google.com";
        //System.out.println(ur().str);
        //ProgramEssential ob = new ProgramEssential();
//        A ob1 = new ProgramEssential();
//       // A ob2 = new A();
//        ob1.m();
//        ob.m();
        //  System.out.println(ob.i);
        // ob.newMethod(1,2.3);
//        char c = 88;
//        long l = (long)c;
//        c = (char)l;
//        String sqe = null;
//        System.out.println(sqe instanceof String);
//        System.out.println(sqe instanceof Object);
//        System.out.println(null instanceof Object);

//        int i = '2';

//        boolean k = 1 <5 ? true: false;
//        //int u = 1<5? break: continue;
//        int r = 2;
//        for(;r<9;r++){}
//        if(r == 2){
//            break;

//        }
        //while(int i =5; i < 7){}

//int y = 10;
//        {System.out.println("abc");}
//        {int y = 15;
//            System.out.println(y);{System.out.println("i");}}
        //y = 8;

//        System.out.println("Main");
//        {
//            System.out.println("Block 1");
//        }
//        {
//            System.out.print("Block 2, ");
//            {
//                System.out.print("Block 2.1, ");
//                {
//                    System.out.println("Block 2.1.1");
//                }
//            }
//            {
//                System.out.println("Block 3");
//            }
//        }        //System.out.println(y);


//        int x,z=60,y = 10;
//        x=z=y;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        int x = 20;
//        int y = 10;
//        System.out.println(x++ -y * 7/ --y);
//        double z = x++ - y *7 / --y + x * 10;
//        System.out.println(z);
//
//        if(1>2)
//
//        }

        //int t = u = 10;

//        boolean a = true;
//        boolean b = true;
//        boolean c = a ^ b;
//        boolean d = false;
//        boolean e = a || b || c || !d;
//        if(a || (b = false)){
//
//        }
//        System.out.println(c);
//        System.out.println(b);
//        System.out.println(a^c);
//        double ir = 2.3f;
//        System.out.println(2^4);
//        int c = 88;
//        System.out.println((Long)c); //can't use wrapper class
//        int b = 10;
//        int println = 10;
//        double d = 12.4D;
//        double y = 0.7;
//        int i1 = 34;
//        int i2 = 45;
//        //i2 = -i2;
//        int k = -i2;
//        int i3 = -i1 + -i2;
//        System.out.println(i1>i2);
//        System.out.println(i2);
//        //int r = null;
//        Integer i = null;
//        //Integer iu = new Integer(null);
//        //System.out.println(iu);
//        Character f = null;
//        //char g = null;
//        String st = "";
//        String u = null;
        //float ae = 0x3.78f;
//        ProgramEssential obj = new ProgramEssential();
//        System.out.println(obj.x);
        //obj.n();
        //obj.mn();
        //  String st = obj.s();
//        float f1 = 34;
//        float f2 = 56;
//        boolean bo = f1<f2;
//        for(int i =1; i++<3;System.out.println(i));
//        int x = 0;
//        int ia = 0;
//        while(false){
//            x=3;
//        }
//        while(ia > 0){
//            x=3;
//        }

//        for(int it =0;it>9;i++){System.out.println("a");}
////        for(;;){;}
//        for(int yu = 0; yu < 2; yu++) System.out.println("g");
//
//        _as:  for(int i = 0; i<5; i++){
//            System.out.print(i + " ");
//            if(i==3) break _as;
//
//        }
//        int[] a = new int[4];
//        System.out.println();
//        int k = 1;
//        String:   while(k<5){
//            System.out.print(k + " ");
//            if(k == 3) break String;
//            k++;
//        }
        //System.out.println(s());
//        int sum = 5;
//        for (int i = 1; i < 4; ) {
//            for (int j = 1; j < 4; ) {
//                for (int k = 1; k < 4; k++) {
//                    System.out.println("k is: " + k);
//                    sum = i*j;
//                    System.out.println("sum is " + sum);
//                    i++;
//                    j++;
//                    k++;
//                    System.out.println(i);
//                    System.out.println(j);
//                    System.out.println(k);
//                    System.out.println("K loop");
//                }
//                System.out.println("J loop");
//            }
//            System.out.println("i loop");
//        }
//        System.out.println(sum);
        //System.out.println(5%3);


//        for(int u = 0; u <3; u++){
//            System.out.println(u);
//            u++;
//        }


//        int[] x = {120, 001, 016 };
//        for(int i = 0; i < x.length; i++)
//            System.out.print(x[i] + " ");
//
//        int io [] = {};
        //System.out.println(io[0]);

//        int [] myArray = null;
//        int [] newA = {};
//        //System.out.print(myArray.length);
//        System.out.print(newA.length);

//        int [] i = {1,4,6,4,7};
//        for(int i = 0; i < 5; i ++){
//            System.out.println(i[i] = 0);
//        }

//        char [] r = new char[4];
//        System.out.println(r[1]);
//
//        String []s = new String[5];
//        System.out.println(s[0]);
//
//        String st = "abcd";
//        if(r.length < st.length()){
//            return;
//        }
//        for(int i =0; i<st.length();i++){
//            r[i] = st.charAt(i);
//        }
//        for(int j = 0; j< r.length; j++){
//            System.out.print(r[j] + " ");
//        }
//        for(int ip =0 ; ; ip++){
//            break;
//            //System.out.println(ip); //infinite loop
//        }
//        String [] s = {"a", "g", "h"};
//        for(String st : s ){
//            System.out.println(st);
//        }

//        int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };
//
//        for ( int index= 0 ; index < egArray.length ; index++  )
//            System.out.print(  egArray[ index ] + "  "  );


//        double [] op = {1,4,5,2,6};
//        System.out.println(op[2]);
//        int [] i = {1,2,3};
//        m(i);
//        System.out.println(i[0]);
        // int i[][] = {{1,2,3}, null};
//        int k[][] = new int[2][3];
//       // int k[][] = {{1,2}, null};
//        for(int x = 0; x< k.length; x++){
//            for(int y = 0; y<k[x].length; y++){
//                //k[x,y] = x+y; //invalid
//                k[x][y] = x+y;
//               // k[[x][y]] = x+y; //invalid
//               // k(x,y) = x+y; //invalid
//            }
//        }
//
//        int [][][] u = {{{1,2,3},{5,8,9}},{{12,13,43,7}},{{5,7,9,12}}};
//        String [][][] s = {{{"a","d", "f"}, {"e", "k", "l", null}, {"t", "o", "p"}},{{"a","o","p","i"}}};
//        for(int i =0; i< s.length; i++){
//            for(int j =0; j<s.length; j++){
//                for(int y =0; y<s.length; y++){
//                   // System.out.println(s[0][1][3]);
//                }
//            }
//        }
//
//        String [] t = {"as", "tr", null};
//        //for(int i = 0; i<t.length; i++){
//            System.out.println(t[2]);
//        //}

//      int [][] f = new int[2][4];
////        int [][] f = new int[2][];
//        f[0][0] = 4;
//        f[0][1] = 3;
//
//        f[1][0] = 5;
//        f[1][1] = 6;
//        f[1][2] = 8;
//        f[1][3] = 9;
//
//        for(int i = 0; i<f.length; i++){
//            for(int j = 0; j< 4; j++){
//                System.out.print(f[i][j] + " ");
//            }
//            System.out.println();
//        }

        // char [][] c = {{new char[]{'c', 'f'}, new char[]{'o', 'h'} }};//invalid initialization
        // char [][] d = new char[][]{{'c','v'},{'r','t'}};

//        int p = 3;
//        int [][][] l = new int[p][p = 2][p];
        //  int f =4;
//        ArrayList<String> list = new ArrayList<>();
//        list.add("mon");
//        list.add("tues");
//        list.add("wed");
//        list.add("sat");
//        for(String s : list){
//            System.out.println(s);
//        }
//        Collections.sort(list);
//        List<Object> obj = new ArrayList<>();
//        obj.add("ram");
//        obj.add(3);
//        obj.add(12000.0);
//        Iterator itr = obj.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next() + " ");
//        }
//        System.out.println();
//        for(Object ob : obj){
//            System.out.print(ob + " ");
//        }

//        String se = null;
//        System.out.println(se.indexOf('r'));
//        String St = "123";
//        System.out.println(St+=false);
//        int x1 = 2;
//        x1++;
//        Integer xq = new Integer('r');
//        byte x = 6;
////        Integer x2 = new Integer('s');
//        switch (x){
//           // case 1.2:
//            case 1:
//                break;
//            case 'x':
//                break;
//
//
//        }
////        Object t = "hhff";
////        int y = (int)t;
//        char c = 'u';
//        int k = 1;

//        boolean v = "true";
//        k += (k = 4) * (k + 2);
//        System.out.println(k);

//        if(true) System.out.println("a");
//        if(true);
//        if(false);
        //  if(true)
        //    if(false);

//
//        if(5 == 5.5f){
//
//        }


//        for(int i = 0; i <list.size(); i++){
//            System.out.print(list.get(i) + " ");
//        }
//        int[] li = {2,4,6,23,76,87,59};
//        for(int i = 0; i<li.length; i++){
//            System.out.print(li[i] + " ");
//        }
//        char c = 'Y';
//        String ss = "eeeeee";
//        int i = c;
        // int j = Integer.parseInt(c);
//        System.out.println(ss.toString());
//        System.out.println(i);
        //long a = 129.36;
//        float r = 12;
//        System.out.println(r);

//        int x = 3;
//        x = x++;
//        //Need to ask:
//
//
//        System.out.println(x);
        //(10 < 12)?System.out.println("Java and C are sisters"): System.out.println("Java and C are enemies");
//        //int y = 23.4f;
//
//        int ai = 10, j = 12, k = 1;
//        k += ai++ - --j;
//        System.out.println(k);
//
//        short s = 10;
//        short s1 = 20;
//        s1 = 10 + 20;
//
//        int d = 10;
//        d = d++;
//        d = d+4;
//        d+=3;
//        System.out.println(d);

//        int result = 1 + 2;
//        System.out.println(result);
//        int j =0;
//        j+=1;
//
//        int o = 0;
//        o = o+9;
//        System.out.println(o+=8);
//        System.out.println(o+7);
//
//        String str = "abs";
//        str = str+"y";
//        str+="z";
//        System.out.println(str + "d");
//        System.out.println(str += "d");
//
//
//        f+=8;
//
//        System.out.println(f+6);
//
//
//        Integer m =null;
//        //int i = 1,00,;
//        char c = 320;
//        //byte b = 322;
 //       String s = "hello";
//        String a = null;
//        if(a == null){
//            System.out.println(1);
//        }
        //  System.out.println(a.concat("s"));
        //  System.out.println(a.toString());
        //   System.out.println(a.contains("ff"));
        //  System.out.println(s instanceof String);

 //       System.out.println(s instanceof Object);
//        System.out.println(null instanceof String);
        //System.out.println(a instanceof String);
        //System.out.println(s instanceof CharSequence);

//        String s = "Java String Quiz";
//        System.out.println(s.toUpperCase().length());
//        System.out.println(s.charAt(16));
        // System.out.println(s.charAt(s.toUpperCase().length()));


//        System.out.println(Boolean.parseBoolean("true"));
//        System.out.println (new Boolean("true"));
//        System.out.println (new Boolean("true") == Boolean.TRUE);
//        System.out.println(Boolean.TRUE);
        // ProgramEssential obj = new ProgramEssential();
        //obj.m();
        // obj.bitWise();
        //BaseA obj1 = new BaseA();
        //obj1.m();
        //System.out.println(obj.a("--0.5"));
//        ProgramEssential.derive();
//        BaseA.derive();

//String methods:
//        String str = " java is a general programming language ";
//        int length = str.length();
//        System.out.println(length);
//        System.out.println(str.indexOf('g'));
//        System.out.println(str.charAt(6));
//        System.out.println(str.replace('r', 't'));
//        System.out.println(str.replace("general", "object oriented"));
//        System.out.println(str.contains("program"));
//        System.out.println(str.substring(10));
//        System.out.println(str.substring(10,13));
//       // System.out.println(str.substring(13,10)); //StringIndexOutOfBoundException
//        System.out.println(str.substring(13,13));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.trim());
//        System.out.println(str.startsWith("j"));
//        System.out.println(str.endsWith("e"));
//        System.out.println(str.equals("java"));
//        System.out.println(str.equalsIgnoreCase("JAVA"));
//        String []words = str.split("\\s");
//        for(String s : words){
//            System.out.print(s + " ");
//        }
//        System.out.println();
//        String str1 = "java";
//        String str2 = new String("java");
//        String str3 = "javas";
//        String str4 = "java";
//        String str5 = str1 + "s";
//        String str6 = null;
//        //System.out.println(str6.concat("hhhh")); //NullPointerException
//        System.out.println(str1.compareTo("kaaa"));
//        System.out.println(str1.equals(str2)); //true
//        System.out.println(str1.equals(str3)); //false
//        System.out.println(str3.equals(str5)); //true
//        System.out.println(str1 ==str2); //false
//        System.out.println(str1==str4); //true
//        System.out.println(str3==str5); //false

        //rules:
//        System.out.println(1+2);
//        System.out.println(1+"e"+5);//left to right
//        String st = 1 + 3 + "a";
//        System.out.println(st);
//        //String st1 = 1+2+3; //can't hold int value
//        String st2 = null;
//       // System.out.println(st2.toString()); //NullPointerException
        //  String st3 = "abcd";
//        String st4 = "abc";
//        String st5 = st4 + "d";
//        String st6 = st4.concat("d");
//        String st7 = new String("abcd");
//        String String = "abc";
//        System.out.println(String);
//        Integer Integer = 11;
//        System.out.println(Integer);
//        System.out.println("hello" + new String(" world"));
//        System.out.println(st3 == st5); //false
//        System.out.println(st3.equals(st5)); //true
//        System.out.println(new Integer(1) == new Integer(1));
//        System.out.println(Integer.valueOf(-128) == Integer.valueOf(-128));
//
// System.out.println(st3==st6); //false
//        System.out.println(st2 + "acdd");
//        System.out.println(st3 == st7);//false
//        System.out.println(st3.charAt(-1));//StringIndexOutOfBoundException
//        String []a = {"a" , "b", "c"};
//        String [] c = new String[]{"a","r","t"};
//        //c[0] = "a";
//        String e = new String("a");
//        String s = "a";
//        System.out.println(c[0] == s);
//        System.out.println(a[0]==s); //true
//        System.out.println(a[0].equals(e));//true
//        String dt = "abcd";
//        System.out.println(dt + false);
//        System.out.println(dt.concat("aaaa"));
//        String st = "kjfdgf";
//
//        //StringBuffer methods:
//        StringBuffer stry = new StringBuffer("abcdyuuu");
//        System.out.println(stry.append("hhdjs", 0, 2));
//        System.out.println(stry.indexOf("g"));
//        Boolean c = new Boolean("tRUe");
//        System.out.println(c);
//        System.out.println(stry.insert(1,1));
       // stry.setLength(3);
//        stry.setLength(-1);
        //System.out.print(stry);

//        System.out.println(str.length());
//        System.out.println(str.append("efgh"));
//        System.out.println(str.reverse());
//        System.out.println(str);
//        System.out.println(str.equals("hgfedcba"));//false
//        System.out.println(stry.replace(1,5,"ff"));
//        System.out.println(str.delete(1,3));
//        System.out.println(str.charAt(3));
//        System.out.println(str.substring(2));
//        System.out.println(str.append("acbfr"));
//        System.out.println(str.capacity());
//        str.ensureCapacity(30);
//        System.out.println(str.capacity());

//        StringBuffer st = new StringBuffer("abcd");
//        StringBuffer st1 = new StringBuffer("abcd");
//        String s = "abcd";
//        String s1 = "abcd";
//        //System.out.println(st == s);
//        System.out.println(st.equals(s));
//        System.out.println(st.equals(st1));

//        StringBuilder str = new StringBuilder("abcd");
//        System.out.println(str.append("efgh"));
//        System.out.println(str.length());
        //System.out.println(str.substring(2,9)); //StringIndexOutOfBoundException
        //System.out.println(str.substring(2,5));
        //System.out.println(str.substring(5,2)); //StringIndexOutOfBoundException

        //Integer it = new Integer("2");
        // System.out.println(Integer.parseInt("4"));
//        System.out.println(i);
//        Short s = new Short("1");
//        System.out.println(s);
        //Double d = new Double("2");
//        System.out.println(d);
//        Character c = new Character('x');
//        System.out.println(c);
//        Byte b = new Byte("2");
//        Long l = new Long(2L);
//        System.out.println(l);
//        Boolean bool = new Boolean("r");
//        System.out.println(bool);

//ArrayList Methods:
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(22);
//        list.add(23);
//        list.add(25);
//        list.add(26);
//        list.add(2);
//        list.add(null);
//    List<String> list1 = new ArrayList<>();
//        list1.add("sweety");
//        list1.add("acde");
//        list1.add("euif");
//        list1.add("iojf");
//        list1.add("jkds");
//        System.out.println(list.size());
//        System.out.println(list.indexOf(2));
//        System.out.println(list.indexOf("r"));
        //System.out.println(liswt.indexOf(null));
//        list1.add(1,"frrr");
//        list.add(null);
//        list.add(10,3);
//        System.out.println(list.add(null));
//        System.out.println(list.remove(null));
//        System.out.println(list.remove(2));
//        System.out.println(list1.remove(1));
//        System.out.println(list1.remove("sweety"));
       // System.out.println(list.remove(30));
     //System.out.println(list1.set(6,"rgtrg"));
//     System.out.println(list1.set(4,"rgtrg"));
//     System.out.println(list1.set(1,null));
//     System.out.println(list1.isEmpty());

//      System.out.println(list1.contains(1));
//      System.out.println(list1.contains(null));
//        System.out.println(list1.get(2));
//        //System.out.println(list1.get("e"));
//        for(Integer k: list){
//            System.out.print(k + " ");
//        }

        //String Methods:
       // String s = "I love java. Its a object oriented programming language 1";
//        System.out.println(s.length());
//        System.out.println(s.indexOf('1'));
//        System.out.println(s.indexOf(1));
//        System.out.println(s.indexOf('o', 19));
//        System.out.println(s.indexOf("ffff"));
//        System.out.println(s.indexOf("lo", 2));
//        System.out.println(s.startsWith("I"));
//        System.out.println(s.startsWith("I"));
//        System.out.println(s.endsWith("I"));
//        System.out.println(s.startsWith("e", 5));
//        System.out.println(s.contains("1"));
//        System.out.println(s.contains('c'));
//         System.out.println(s.replace('2', 'l'));
//         System.out.println(s.replace("l", "j"));
//        System.out.println(s.substring(117));
//          System.out.println(s.charAt(5));
//          System.out.println(s.hashCode());
//          System.out.println(s.toString());
      //  System.out.println(s.concat("dferf"));

        //StringBuilder Methods:
//        StringBuilder obj = new StringBuilder("Hello, I am java programming language");
//        StringBuilder ob = new StringBuilder("hello");
//        System.out.println(obj.append(" I am appended at en"));
//        System.out.println(obj.append('d'));
//        System.out.println(obj.append(1));
        //System.out.println(obj.insert(2,"yy"));
//        String a[] = {"3","4","6"};
//        String b[] = new String[4];
//        System.out.println(obj.insert(2,new String[3]));
//        System.out.println(ob.insert(2,(new int[4])));
//        System.out.println(obj.replace(2,5,"t"));
//        System.out.println(obj.charAt(2));
//        System.out.println(obj.reverse());
//        System.out.println(obj.reverse());
//        System.out.println(obj.length());
//        System.out.println(obj.substring(29, 37));
    //    System.out.println(obj.capacity());
//        System.out.println(obj.indexOf(","));
   //     System.out.println(obj.indexOf("l", 90));
//        System.out.println(obj.lastIndexOf("l", 5));
//        System.out.println(ob.lastIndexOf("l",80));
//        ob.setLength(0);
//        System.out.println(ob);


//        Boolean b = new Boolean("a");
//        System.out.println(b);
//        System.out.println(Boolean.parseBoolean("1"));
//        System.out.println(Integer.parseInt("1"));
//      System.out.println(Integer.parseInt("true"));
//      System.out.println(Integer.parseInt("1.0"));
        //short se = 10;
       // System.out.println(Integer.parseInt("10L"));
//        System.out.println(Float.parseFloat("1"));
//        System.out.println(Boolean.valueOf(null));
//        System.out.println(Boolean.valueOf("trUE"));
//        System.out.println(Integer.valueOf("i"));
//        System.out.println(Integer.valueOf(null));
//        System.out.println(Integer.valueOf(3));
//        System.out.println(Integer.valueOf("true"));
//        System.out.println(Integer.valueOf("1", 9));

    }
//public boolean a(){
//    return false;
//}
//
//   public Boolean b(){
//       return false;
//   }
//
//    public Integer c(){
//       return 0;
//    }
//
//
//    public static String getBoolean(){
//        return "true";
//    }
//
//    public int max(int x, int y) {
//        if (x > y) {
//            return x;
//        }
//        if (x > 6) {
//            return x;
//        } else {
//            return y;
//        }
//
//    }

}
//    Given the code. What is the result?
//        1.  public static void main(String args[]) {
//        2.      Object myObj = new String[]{"one", "two", "three"} {
//        3.          for (String s : (String[])myObj) System.out.print(s + ".");
//        4.      }
//        5.  }
//        A) one.two.three.
//        B) Compilation fails because of an error at line 2
//        C) Compilation fails because of an error at line 3
//        D) An exception is thrown at runtime


//    Given the code. What is the result?
//class Vehicle {
//    public void printSound() {
//        System.out.print("vehicle");
//    }
//}

//class Car extends Vehicle {
//    public void printSound() {
//        System.out.print("car");
//    }
//}
//
//class Bike extends Vehicle {
//    public void printSound() {
//        System.out.print("bike");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Vehicle v = new Car();
//        Bike b = (Bike) v;
//
//        v.printSound();
//        b.printSound();
//    }
//}
//A) Compilation fails.
//        B) An exception is thrown at runtime.
//        C) "vehiclecar" is printed.
//        D) "vehiclebike" is printed.
//        E) "carcar" is printed.
//        F) "bikebike" is printed

//Output:
//B -- runtime
//
//class Vehicle {
//    public void printSound() {
//        System.out.print("vehicle");
//    }
//}
//
//class Car extends Vehicle {
//    public void printSound() {
//        System.out.print("car");
//    }
//}
//
//class Bike extends Vehicle {
//    public void printSound() {
//        System.out.print("bike");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Vehicle v = new Car();
//        Car c = (Car) v;
//
//        v.printSound();
//        c.printSound();
//    }
//}
//
//Output:
//carcar