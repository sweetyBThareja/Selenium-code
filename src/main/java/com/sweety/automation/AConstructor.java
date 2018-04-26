package com.sweety.automation;

/**
 * Created by skumari on 1/12/2018.
 */

public class AConstructor{
    int id;
    String name;
    int salary;

    AConstructor(){
        System.out.println("Default Constructor");
    }

    AConstructor(int a, String b){
        id = a;
        name = b;

    }

    AConstructor(String c, int d, int s){
        id = d;
        name = c;
        salary = s;

    }

    public void showData(){
        System.out.println("id of person is " + id);
        System.out.println("Name of the person is " + name);
        System.out.println("Salary of the person is " + salary);
    }

    public static void main(String args[]){
        AConstructor obj = new AConstructor();
        AConstructor obj1 = new AConstructor(1, "Rajat");
        obj1.showData();
        AConstructor obj2 = new AConstructor(2, "Kiara");
        obj2.showData();
        AConstructor obj3 = new AConstructor("Thareja", 3, 1000);
        obj3.showData();
    }
}