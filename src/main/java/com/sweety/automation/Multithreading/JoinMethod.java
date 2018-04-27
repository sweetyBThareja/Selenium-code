package com.sweety.automation.Multithreading;

public class JoinMethod extends Thread {
    public void run(){
        for(int i =0; i<5; i++){
            try{
            Thread.sleep(500);
        }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.print(i + " ");
    }
}
public static void main(String args[]) throws InterruptedException {
    JoinMethod t1 = new JoinMethod();
    JoinMethod t2 = new JoinMethod();
    JoinMethod t3 = new JoinMethod();
    t1.start();
    t1.join(); //first this method executes

    t2.start();
    t3.start();
}
}

