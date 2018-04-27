package com.sweety.automation.Multithreading;

public class NamingThread extends Thread {
    public void run(){
        System.out.println("running");
    }

    public static void main(String args[]){
        NamingThread t1 = new NamingThread();
        NamingThread t2 = new NamingThread();
        t1.start();
        t2.start();
        t2.setName("New thread");
        System.out.println("Name of thread is " + t2.getName());
    }

}

