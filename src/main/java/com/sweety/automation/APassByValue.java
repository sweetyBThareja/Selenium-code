package com.sweety.automation;

/**
 * Created by skumari on 1/23/2018.
 */
public class APassByValue {
        int num=10;
        int data = 20;
        String S =  "abc";
        public void showDetails(int num, String S){
            num = num+100;
            S = S;
        }

    public void showDetail(APassByValue obj){
        obj.data = obj.data+100;
    }
        public static void main(String args[]){
            APassByValue obj = new APassByValue();
            System.out.println("before change " + obj.num);
            obj.showDetails(300, "kiara");
            System.out.println("After Change " + obj.num);
            System.out.println("After Change " + obj.S);
            System.out.println("Before passing object " + obj.data);
            obj.showDetail(obj);
            System.out.println("After passing object " + obj.data);

        }
    }


