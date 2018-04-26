package com.sweety.automation;

/**
 * Created by skumari on 3/30/2018.
 */
class Polymorphism {
    public static void main(String args[]){
       AA a = new AA();
       BB b = new BB();
       CC c = new CC();
       DD d = new DD();
//       a = b;
//       b = a;// compile error - b can' hold parent class object without casting
//       b = (BB)a;
        a = c;
//        a = (CC)d; //compile error -- no relation b/w c and d

    }
}

class AA{

}

class BB extends AA{

}

class CC extends BB{

}

class DD extends AA{

}