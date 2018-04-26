package com.sweety.automation;

/**
 * Created by skumari on 1/16/2018.
 */
public class VariableAgrs {
    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }
    public static void main(String[] args){
        walk(1);
        walk(1,2); //line pass 1 as start and two more valaues. Java converts these two values into array of length 2.
        walk(1,2,3);
        //walk(1,{1,2});
        walk(1, new int[] {4, 5});
    }

}
