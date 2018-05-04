package com.sweety.automation.StringRelated;
//find number of characters, number of words and number of lines in a text file.
//http://javaconceptoftheday.com/find-number-of-characters-words-and-lines-in-file-in-java/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordsCharsLinesInFile {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = null;
        try{

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        reader = new BufferedReader(new FileReader("D:\\testout.txt"));
        String currentLine = reader.readLine();
        while(currentLine != null){
            lineCount++;
            String [] words = currentLine.split(" ");
            wordCount = wordCount + words.length;
            for(String st : words){
                charCount = charCount + st.length();
            }
            currentLine = reader.readLine();
        }

        System.out.println("Total line in a file : " + lineCount);
        System.out.println("Total words in a file : " + wordCount);
        System.out.println("Total chars in a file : " + charCount);

    }catch(IOException e){
        System.out.println(e);
        }finally {
            reader.close();
        }


}}
