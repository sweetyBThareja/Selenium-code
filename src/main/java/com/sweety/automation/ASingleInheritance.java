package com.sweety.automation;

/**
 * Created by skumari on 1/24/2018.
 */
public class ASingleInheritance extends AMultiLevel {
    int data = 40;
//    {System.out.println("child");}
//{System.out.println(super.data);}
//    public ASingleInheritance(){
//       // super(); // super() is added in each class constructor automatically by compiler if there is no super() or this().
//        //super(5);
//        System.out.println("I am derive class constructor");
//    }
//    public ASingleInheritance(int data){
//        //super(); // super() is added in each child class constructor automatically by compiler if there is no super() or this().
//        System.out.println("I am child class parametrized constructor " + data);
//    }
//
    public void showData(){//Method Overriding -- can have same or more accessible modifier like in base its protected and derived its public
        System.out.println("I am child class");
        System.out.println(2*super.data); //super can be used to refer immediate parent class instance variable
    }
//
//    public void work(){
//        super.showData(); //super is used to call immediate parent class method
//    }
//    public void showDetails() {
//        System.out.println("Hi I am base class");
//    }

//    static void d(){
//        System.out.println("I am child class static method");
//    }

    public static void main(String args[]){
        ASingleInheritance obj = new ASingleInheritance(); //obj of derive class
        obj.basemethod();
        obj.showData();
      // AMultiLevel obj1 = new AMultiLevel();
//        ABase obj2 = new ABase(); //base class object is created so, base class method is called
//        ABase obj3 = new ASingleInheritance();
        //ASingleInheritance obj4 = new AMultiLevel(); //can't create child class reference with parent class object
//        obj.showDetails();
//        obj.show();
//        obj.showData();
//        //obj.work();
//        obj1.showData();
//        System.out.println(obj2.data); //base class reference, so base class variable called.
//        obj2.showDetails();
//        System.out.println(obj3.data);
//        System.out.println(obj1.data);
//        System.out.println(obj.data); //child class reference, so child class variable called
//        ASingleInheritance.d();
//        AMultiLevel.d();
        //ASingleInheritance obj7 = new ASingleInheritance(20);
    }
}
