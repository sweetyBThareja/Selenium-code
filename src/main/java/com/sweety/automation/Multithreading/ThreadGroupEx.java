package com.sweety.automation.Multithreading;

public class ThreadGroupEx implements Runnable {
    public void run(){
        System.out.println("Name of the current thread is " + Thread.currentThread().getName());
    }

    public static void main(String args[]){
        ThreadGroupEx obj = new ThreadGroupEx();
        ThreadGroup tg1 = new ThreadGroup("Group1");

        Thread t1 = new Thread(tg1, obj, "one");
        t1.start();
        Thread t2 = new Thread(tg1, obj, "two");
        t2.start();
        Thread t3 = new Thread(tg1, obj, "three");
        t3.start();

        System.out.println("Thread Group Name: "+tg1.getName());
        tg1.list();

    }
}
