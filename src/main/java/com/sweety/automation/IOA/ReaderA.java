package com.sweety.automation.IOA;

import java.io.FileReader;
import java.io.Reader;

public class ReaderA {
    public static void main(String args[]){
        try {
            Reader r = new FileReader("D:\\output.txt");
            int data = r.read();
            System.out.println(data);
            while(data!=-1){
                System.out.print((char)data);
                data = r.read();
            }
        }catch(Exception e)    {
           System.out.println(e);
        }
    }
}
