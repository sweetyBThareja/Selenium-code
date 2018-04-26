package com.sweety.automation.IOA;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by skumari on 4/23/2018.
 */
public class FileReaderA {
    public static void main(String args[]){
        try{
            FileReader f = new FileReader("D:\\testout.txt");
            int data = f.read();
            while(data!= -1){
                System.out.print((char)data);
                data = f.read();
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
