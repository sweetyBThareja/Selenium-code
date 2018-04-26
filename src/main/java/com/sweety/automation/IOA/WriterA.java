package com.sweety.automation.IOA;

import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by skumari on 4/23/2018.
 */
public class WriterA {

    public static void main(String args[]){
        try{
            Writer w = new FileWriter("D:\\output.txt");
            String content = "I love my job";
            w.write(content);
            w.close();
            System.out.println("Done");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
