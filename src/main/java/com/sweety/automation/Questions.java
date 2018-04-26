package com.sweety.automation;

public class Questions {
    int id;
    String name;
    String S = "abc";

    public Questions(){
        System.out.println("I am default Constructor");
    }

    public Questions(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void m(String a){
        String S = a;
        //S = a;
       System.out.println(S);
    }

    public static void main(String args[]){
        String a = "111";
        int value = Integer.parseInt(a);
        System.out.println(value);
        Questions [] ques = {new Questions(1, "a"), new Questions(2, "b"), new Questions(3, "c")};
        System.out.println(ques);
        System.out.println(ques[1]);
        System.out.println(ques[1].id);
        Questions obj = new Questions();
        obj.m("kiara");
        System.out.println(obj.S);
    }
}
