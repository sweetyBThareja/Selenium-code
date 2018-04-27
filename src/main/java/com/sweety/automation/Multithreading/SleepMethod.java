package com.sweety.automation.Multithreading;

public class SleepMethod extends Thread{
   public void run(){
       for(int i = 0; i<5; i++){
           try{
            Thread.sleep(500);
           }catch(InterruptedException e){
            System.out.println(e);
           }
           System.out.println(i);
       }
   }

   public static void main(String args[]){
       SleepMethod obj = new SleepMethod();
       SleepMethod obj1 = new SleepMethod();
       obj.start();
       obj1.start();
   }
}
