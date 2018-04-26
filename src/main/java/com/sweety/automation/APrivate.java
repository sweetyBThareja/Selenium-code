package com.sweety.automation;
import com.java.automation.*;

/**
 * Created by skumari on 1/19/2018.
 */

public class APrivate extends AProtected {
    APrivate(){System.out.println("I am default constructor");}
    public static void main(String args[]) {
       APrivate ob =  new APrivate();
        ob.basemethod();
        AModifier obj = new AModifier(); //Within same package
//        System.out.println(obj.data);
//        obj.showData();
//        APrivate obj1 = new APrivate(); //object of derive class -- different package
//        System.out.println(obj1.data);
//        obj1.showData();
//        APublic obj3 = new APublic();
//        System.out.println(obj3.data);
//        obj3.showData();
//        //obj3.show(); //cannot be accessed outside the package.
//        AProtected ob = new APrivate();
//        obj1.showData();
    }
}


