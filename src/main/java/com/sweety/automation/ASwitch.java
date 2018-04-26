package com.sweety.automation;

/**
 * Created by skumari on 1/31/2018.
 */
public class ASwitch {
    public static void main(String args[]){
        int dayOfWeek = 5;
        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 't':
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

//
    }

}
