package com.sweety.automation.IOA;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamA {
    public static void main(String args[]) throws IOException{
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        PrintStream ps = new PrintStream(fout);
        ps.println(2016);
        ps.println("Hello Java");
        ps.print("Welcome to java");
        ps.close();
        fout.close();
        System.out.println("Done");
    }
}
