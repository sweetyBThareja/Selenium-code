package com.sweety.automation.IOA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderA {
    public static void main(String args[]){
        try{
            FileReader r = new FileReader("D:\\output.txt");
            BufferedReader buffer = new BufferedReader(r);
            int data= buffer.read();
            while(data!=-1){
            System.out.print((char)data);
            data = buffer.read();
            }
            buffer.close();
            r.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
