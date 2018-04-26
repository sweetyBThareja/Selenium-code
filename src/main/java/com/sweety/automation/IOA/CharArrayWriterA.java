package com.sweety.automation.IOA;


import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterA {
    public static void main(String args[]) throws IOException{
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("Welcome to testing world");
        FileWriter w = new FileWriter("D:\\testout.txt");
        FileWriter w1 = new FileWriter("D:\\output.txt");
        FileWriter w2 = new FileWriter("D:\\out.txt");
        writer.writeTo(w);
        writer.writeTo(w1);
        writer.writeTo(w2);
        System.out.println("Done");
    }
}
