package com.sweety.automation.IOA;

import java.io.*;

public class StringWriterA {
    public static void main(String args[]) throws IOException{
        char [] arr = new char[514];
       StringWriter writer = new StringWriter();
       FileInputStream fs = new FileInputStream("D:\\testout.txt");
       BufferedReader buffer = new BufferedReader(new InputStreamReader(fs, "UTF-8"));
      int data = buffer.read(arr);
      while(data!=-1){
        writer.write(arr,0,data);
        data = buffer.read();
      }
        System.out.println(writer.toString());
        writer.close();
        buffer.close();
        System.out.println("Done");

    }
}
