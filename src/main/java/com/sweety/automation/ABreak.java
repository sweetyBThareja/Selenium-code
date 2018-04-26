package com.sweety.automation;

/**
 * Created by skumari on 1/31/2018.
 */
public class ABreak {
    public static void main(String args[]){
        for(int i = 1; i <=10; i++){
            if(i==5){
                break; //break the loop when i==5
            }
            System.out.println(i);
        }
        System.out.println("Continue Statement");
        for(int j = 2; j <=8; j++){
            if(j==5){
                continue; //not print 5, that loop skipped
            }
            System.out.println(j);
        }

    }
}
