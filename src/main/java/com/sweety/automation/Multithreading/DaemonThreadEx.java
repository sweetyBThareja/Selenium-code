package com.sweety.automation.Multithreading;

public class DaemonThreadEx extends Thread {

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("current thread is Daemon");
        }else {
            System.out.println("current thread is user thread");
        }
    }

    public static void main(String args[]){
    DaemonThreadEx t1 = new DaemonThreadEx();
    DaemonThreadEx t2 = new DaemonThreadEx();
//        t1.start();
    t1.setDaemon(true); //Throw IllegalThreadStateException when set thread as Daemon after start

    t1.start();
    t2.start();
}}
