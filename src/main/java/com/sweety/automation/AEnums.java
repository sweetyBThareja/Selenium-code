package com.sweety.automation;

/**
 * Created by skumari on 2/20/2018.
 */
enum Color {
    RED, BLUE, GREEN;
}
public class AEnums {
    public static void main(String args[]){
      Color color = Color.RED;
        switch(color){
            case BLUE:
                System.out.println("1");
                break;
            case RED:
                System.out.println("3");
                break;
            case GREEN:
                System.out.println("4");
                break;
            default:
                System.out.println("No match found");
                break;
        }
    }
}
