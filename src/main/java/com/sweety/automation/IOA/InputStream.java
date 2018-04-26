package com.sweety.automation.IOA;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputInputStream {
        public FileOutputInputStream() throws IOException {
            FileOutputStream fout = new FileOutputStream("D:\\output.txt");
            String str = "I love java programs";
            fout.write(str.getBytes());
            fout.close();
            System.out.print("Done");
        }
    }

public class InputStream extends FileOutputInputStream{
    public InputStream() throws IOException {
        FileInputStream fin = new FileInputStream("D:\\output.txt");
        int data = fin.read();
        while(data!=-1){
            System.out.print((char)data);
            data = fin.read();
        }
        System.out.println();
        System.out.println("Success");
    }

    public static void main(String args[]) throws IOException{
        InputStream obj = new InputStream();
    }
}