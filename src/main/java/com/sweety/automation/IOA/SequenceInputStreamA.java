package com.sweety.automation.IOA;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamA {
    public static void main(String args[]) throws IOException{
        FileInputStream fin = new FileInputStream("D:\\testout.txt");
        FileInputStream fn = new FileInputStream("D:\\output.txt");
        SequenceInputStream sis = new SequenceInputStream(fin,fn);
        int data = sis.read();
        while (data!=-1){
            System.out.print((char)data);
            data = sis.read();
        }
    }
}
