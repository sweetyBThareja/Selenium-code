package com.sweety.automation;

import java.io.IOException;

/**
 * Created by skumari on 2/9/2018.
 */
public class AThrowsKeyword {

    void n() throws IOException{
        throw new IOException("Device Error");
    }

    void m() throws IOException{
        n();
    }

    void p() throws IOException{
        try {
            m();
        }catch(Exception e){
            System.out.println("Checked Exception propagated by throws keyword");
        }
    }

    public static void main(String args[]) throws IOException {
        AThrowsKeyword obj = new AThrowsKeyword();
        obj.p();
        System.out.println("Normal Flow");
    }
}
