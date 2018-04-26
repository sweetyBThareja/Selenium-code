package com.sweety.automation;

/**
 * Created by skumari on 1/31/2018.
 */
public class AForEach {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
        System.out.print(x);
        System.out.print(',');
        }
    }
}
