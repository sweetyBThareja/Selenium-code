package com.sweety.automation.Multithreading;

class ThreadExample extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String args[]){
        ThreadExample obj = new ThreadExample();
        obj.start();
    }
}

class ThreadExample1 implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String args[]){
        ThreadExample1 obj = new ThreadExample1();
        Thread th = new Thread(obj);
        th.start();
    }

}
