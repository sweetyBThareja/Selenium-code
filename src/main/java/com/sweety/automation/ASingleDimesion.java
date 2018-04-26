package com.sweety.automation;

/**
 * Created by skumari on 1/31/2018.
 */
public class ASingleDimesion{
    public static void main(String args[]) {
        int[] a = new int[5]; //declaration and initialization
        a[0] = 1;
        a[1] = 20;
        a[2] = 10;
        a[3] = 4;
        a[4] = 30;

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //int[] b = new int[]{12, 13, 14, 15, 16};
        int[] b = {12, 13, 14, 15, 16};
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }

}
