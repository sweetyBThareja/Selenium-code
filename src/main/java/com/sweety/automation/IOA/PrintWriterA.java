package com.sweety.automation.IOA;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterA {
    public static void main(String args[]) throws IOException{
        PrintWriter pw = new PrintWriter("D:\\testout.txt");
        pw.write("Welcome to java world");
        pw.flush();
        pw.close();
        System.out.println("Done");
    }
}
