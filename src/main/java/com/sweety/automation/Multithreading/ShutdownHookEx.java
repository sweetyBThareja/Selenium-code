package com.sweety.automation.Multithreading;

public class ShutdownHookEx {
    public static void main(String args[]){
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());
        System.out.println("Now main is sleeping");
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("shut down hook task is completed");
    }
}


