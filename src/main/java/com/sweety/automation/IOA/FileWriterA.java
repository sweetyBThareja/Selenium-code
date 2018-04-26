package com.sweety.automation.IOA;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriterA {

    public static void main(String args[]) {
        try {
            FileWriter f = new FileWriter("D:\\testout.txt");
            f.write("I love java and selenium. ");
            f.write("I love testing");
            f.close();
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
