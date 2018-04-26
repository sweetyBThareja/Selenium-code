package com.sweety.automation.IOA;


import java.io.*;

//not working -- need to verify
public class FilterWriterA {
    public static void main(String args[]){
        try{
            FileWriter writer = new FileWriter("D:\\testout.txt");
            CustomFilterWriter fw = new CustomFilterWriter(writer);
            fw.write("I love my country",0, 5);
            FileReader r = new FileReader("D:\\testout.txt");
            BufferedReader reader = new BufferedReader(r);
            int data = reader.read();
            while(data!=-1){
                System.out.print((char)data);
                data = reader.read();
            }
            System.out.println("Done");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}

class CustomFilterWriter extends FilterWriter{
    CustomFilterWriter(Writer out){
        super(out);
    }
}