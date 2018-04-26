package com.sweety.automation.IOA;
import java.io.Console;


public class ConsoleA {
    public static void main(String args[]){
        Console c = System.console();
        System.out.println("Enter your name");
        String n = c.readLine();
        System.out.println("Welcome " + n);

    }
}

//Run through cmd prompt
//Output:
//C:\Users\skumari.OSIUS\Desktop>java ConsoleA
//Enter your name
//        sweety
//    Welcome sweety