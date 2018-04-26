package com.sweety.automation.IOA;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderA {
    public static void main(String args[]) throws IOException{
        String str = "Hi, Welcome to java world";
        StringReader reader = new StringReader(str);
        int data = reader.read();
        while(data!=-1){
            System.out.print((char)data);
            data = reader.read();
        }

    }
}
