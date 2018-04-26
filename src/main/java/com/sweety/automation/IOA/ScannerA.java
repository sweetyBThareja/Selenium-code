package com.sweety.automation.IOA;

import java.util.Scanner;

public class ScannerA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your rollNo");
        int rollNo = sc.nextInt();
        System.out.println("Name is " + name + " Roll No. is " + rollNo);
    }
}
