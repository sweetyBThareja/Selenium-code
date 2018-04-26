package com.sweety.automation;

/**
 * Created by skumari on 2/1/2018.
 */
public class AMultiDimension {
    public static void main(String args[]) {
        int[][] a = {{1, 2, 3}, {23, 45, 56}, {43, 42, 1}};
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
