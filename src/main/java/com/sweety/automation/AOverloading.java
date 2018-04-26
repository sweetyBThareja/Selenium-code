package com.sweety.automation;

/**
 * Created by skumari on 1/16/2018.
 */
public class AOverloading  {

    // By changing number of parameters
    //static int c;

    public static int add(int a, int b){
        //c = a+b;
        return a+b;
        //return c;
    }
    public static int add(int a, int b, int c){
        return a+b+c;

    }
    //By changing data type
    public static double add(double c, double d){
        return c+d;
    }

   // public static void showData(){
     //   System.out.println("data is " + c);
    //}


    public static void main(String args[]){
        System.out.println(AOverloading.add(2,3)); //Static Method
        System.out.println(AOverloading.add(4,5,6)); // two ways to call method.
        AOverloading obj = new AOverloading();
        obj.add(2,3);
        //obj.showData();
        System.out.println(AOverloading.add(1.1,2.1));
    }
}
