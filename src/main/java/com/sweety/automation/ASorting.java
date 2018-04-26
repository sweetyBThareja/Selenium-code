package com.sweety.automation;
import java.util.Arrays;

/**
 * Created by skumari on 2/1/2018.
 */
public class ASorting {
    public static void main(String args[]){
        int [] a = {28,34,11,2,65,32};
      //  Arrays.sort(a); //already given method

        int temp = 0;
        for(int i=0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
            if(a[i] > a[j]) { //Ascending order and for descending use a[i] < a[j]
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            }

        }

        for(int i =0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
