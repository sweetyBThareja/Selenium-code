package com.sweety.automation;

public class AThrowKeyword{

    static void validate(int age){
        try{
            if(age<18)
                throw new ArithmeticException("not valid"); //Explicitly throw exception
            else
                System.out.println("welcome to vote");
        }

    catch(Exception e){
        System.out.println("Caught");
    }finally{
            System.out.println("I am finally executed");
        }

    }

    public static void main(String args[]){
        validate(13);
        System.out.println("rest of the code...");
    }
}
