package com.sweety.automation.IOA;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterA {
    public static void main(String args[]){
        try {
            FileWriter writer = new FileWriter("D:\\testout.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Welcome to java");
            buffer.close();
            System.out.println("Done");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
