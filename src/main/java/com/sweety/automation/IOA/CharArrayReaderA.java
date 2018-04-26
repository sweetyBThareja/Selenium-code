package com.sweety.automation.IOA;


import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderA {
    public static void main(String args[]){
        try{
          char [] arr = {'j', 'a', 'v', 'a', 's', 'e', 'l'};
            CharArrayReader r = new CharArrayReader(arr);
            int data = r.read();
            while(data!=-1){
                System.out.print((char)data + ":");
                System.out.print(data);
                data = r.read();
                System.out.println();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
