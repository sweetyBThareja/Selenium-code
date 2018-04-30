package com.sweety.automation.Multithreading;

public class PriorityThread extends Thread {

    public void run(){
        System.out.println("Name of the thread " + Thread.currentThread().getName());
        System.out.println("running as priority basis " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]){
        PriorityThread obj = new PriorityThread();
        PriorityThread obj1 = new PriorityThread();
        PriorityThread obj2 = new PriorityThread();
        obj.setPriority(Thread.MIN_PRIORITY);
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj.start();
        obj1.start();
        obj2.start();

    }
}
