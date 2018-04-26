package com.sweety.automation;

/**
 * Created by skumari on 1/24/2018.
 */
interface Printable{
    void show();
}
interface Showable{
        void print();
        void show();
        }
interface Detail extends Printable, Showable{
    void details();
}

abstract class Abst implements Detail{}

class AInterface extends Abst implements Detail,Showable {
    public void show(){
       System.out.println("Class implements interfaces");
    }
    public void print(){
        System.out.println("World");
    }
    public void details(){
        System.out.println("one interface extends another");
    }

    public static void main(String args[]){
        AInterface obj = new AInterface();
        obj.show();
        obj.print();
        obj.details();
    }
}
