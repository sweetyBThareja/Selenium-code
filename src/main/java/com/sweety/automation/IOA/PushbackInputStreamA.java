package com.sweety.automation.IOA;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamA {
    public static void main(String arg[]) throws IOException {
            String str = "1##2#34###12";
        byte arr[] = str.getBytes();
        ByteArrayInputStream ary = new ByteArrayInputStream(arr);
        PushbackInputStream ps = new PushbackInputStream(ary);
        int i = ps.read();
        while (i!=-1){
            if(i == '#') {
                int j;
                if( (j = ps.read()) == '#'){
                    System.out.print("**");
                }else {
                    ps.unread(j);
                    System.out.print((char)i);
                }
            }else {
                System.out.print((char)i);
            }
            i = ps.read();
        }

    }
}
