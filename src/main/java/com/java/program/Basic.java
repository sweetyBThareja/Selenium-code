package com.java.program;

/**
 * Created by skumari on 2/14/2018.
 */
public class Basic {
    public static void main(String args[]){
        Basic.main("a");
        int k = 9;
        for(int i = 8; i<12; i++ ) {
            switch (i) {
                case 9:
                    System.out.println("9 is printed");
                    for(int j = 1; j < 5; j++){
                        System.out.println(j);
                        break;
                    }
                    break;
                case 6:
                    System.out.println("6 is printed");
                    break;
                case 8:
                    System.out.println("8 is printed");
                    break;
                default:
                    System.out.println("no value matched");
                    break;
            }
        }
    }
    final public static int main(String arg){
        System.out.println("I am also main method");
        return 10;
    }






}
