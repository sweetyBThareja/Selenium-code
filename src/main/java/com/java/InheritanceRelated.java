package com.java;

interface a{
    int i = 20;
    //int x = 23;
    public default int m(){
        System.out.println("I am default method");
        return 1;
    }
}

interface b extends a{
     int m();
}
public class InheritanceRelated extends SingleInheritance implements b, y{
//    int a;
     int a = 12;
 public int m(){System.out.println("I am implemented method");
 return 2;}
//    {System.out.println("I am child class instance block");}
//
   // static{System.out.println("I am child class static block");}
  //  public InheritanceRelated(){
   //     System.out.println("I am child class default constructor");
    //}
//
//    protected int m(int a, float b){
//        return 1;
//    }
//    public InheritanceRelated(int a){
//        //super(40);
//        this.a = 20;
//       // super(23);
//        System.out.println("I am parameterized child class constructor");
//    }
//    protected void m(){
//        super.m();
//        System.out.println("I am child class method");
//        System.out.println(a);
//    }

   // public static void n(){
//        System.out.println("I am child class static method");
//    }
//    public void sum(int w){
//        a = a + w;
//        System.out.println(a);
//    }
//
//    public void child(){
//        System.out.println("I am child class method only");
//    }
      public static void main(String args[]){
          InheritanceRelated obj = new InheritanceRelated();
          System.out.println(obj.m());
          System.out.println(((y)obj).i);
         // System.out.println(obj.x);
//          a = a +10;
//          System.out.println(a);
//          SingleInheritance ob = new InheritanceRelated();
//          ob.sum(20);
//          System.out.println(ob.a);
//          SingleInheritance ob1 = new SingleInheritance();
//          ((InheritanceRelated)ob).child();
//          a = a +10;
//          System.out.println(a);
//          a = ob.a + 10;
//          System.out.println(a);

         // InheritanceRelated obj = new InheritanceRelated();

//          InheritanceRelated obj1 = new InheritanceRelated(30);
//          obj1.m();
//          InheritanceRelated.n();
//          obj.n();
//          SingleInheritance ob = new InheritanceRelated(25);
   //       new InheritanceRelated();
//          SingleInheritance ob = new SingleInheritance();
//          ob.m();
//          System.out.println(ob.a);
//          ob.n();
          //InheritanceRelated ob1 = new SingleInheritance();

      }
}
