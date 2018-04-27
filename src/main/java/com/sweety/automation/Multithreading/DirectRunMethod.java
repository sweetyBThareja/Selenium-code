package com.sweety.automation.Multithreading;

public class DirectRunMethod extends Thread {
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]){
        DirectRunMethod obj = new DirectRunMethod();
        DirectRunMethod obj1 = new DirectRunMethod();
        obj.run();
        obj1.run(); //no switching bcz here obj and obj1 treat as normal object not thread obj
    }
}
