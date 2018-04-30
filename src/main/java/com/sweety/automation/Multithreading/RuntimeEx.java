package com.sweety.automation.Multithreading;

import java.io.IOException;

public class RuntimeEx {
    public static void main(String args[]) throws IOException {
        Runtime rs = Runtime.getRuntime();
        rs.exec("notepad");
        Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
        Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -r -t 0"); //restart system
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Total Memory: "+rs.totalMemory());
        System.out.println("Free Memory: "+rs.freeMemory());

    }
}
