package com.sweety.automation;

import java.io.IOException;


public class Notepad {

    public static void main(String args[]) throws IOException {
        Runtime rs = Runtime.getRuntime();
        try {
            System.out.println("Opening Notepad");
            Process process = rs.exec("notepad");
            System.out.println("Closing Notepad");
            process.destroy();
            System.out.println("Opening existing notepad");
            Process p = rs.exec("C:\\Windows\\System32\\notepad.exe D:\\recipies.txt");
            p.destroy();
            rs.exec("excel");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
