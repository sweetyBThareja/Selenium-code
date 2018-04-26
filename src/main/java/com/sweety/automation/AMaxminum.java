package com.sweety.automation;

/**
 * Created by skumari on 2/1/2018.
 */
public class AMaxminum {
    public static void main(String args[]) {
        int a[] = {8,19,35,1,23};
        int max = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
      System.out.println(max);
    }
}
