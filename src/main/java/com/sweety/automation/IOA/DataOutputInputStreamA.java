package com.sweety.automation.IOA;

import java.io.*;

class DataOutputStreamA{
    public DataOutputStreamA() throws IOException{
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.write("I love java".getBytes());
        System.out.print("Done");
        dout.close();
        fout.close();

    }
}
public class DataOutputInputStreamA extends DataOutputStreamA{
    public DataOutputInputStreamA() throws IOException {
        FileInputStream fin = new FileInputStream("D:\\testout.txt");
        DataInputStream din = new DataInputStream(fin);
        int data = din.read();
        while(data!=-1){
            System.out.print((char)data);
            data = din.read();
        }
    }
    public static void main(String args[]) throws IOException{
        DataOutputInputStreamA obj = new DataOutputInputStreamA();
    }
}
