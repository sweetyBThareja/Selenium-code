package com.sweety.automation.StringRelated;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostRepeatedWordFile {
    public static void main(String args[]) throws FileNotFoundException {
        HashMap<String, Integer> wordsMapCount = new HashMap<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("D:\\testout.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null){
                String [] words = currentLine.toLowerCase().split(" ");
                for(String word : words){
                   if(wordsMapCount.containsKey(word)){
                        wordsMapCount.put(word, wordsMapCount.get(word)+1);
                    }else {
                       wordsMapCount.put(word,1);
                   }
                }
                currentLine = reader.readLine();
            }

            String mostRepeatedWord = null;
            int count = 0;

            Set<Map.Entry<String, Integer>> entrySet = wordsMapCount.entrySet();
            for(Map.Entry<String, Integer> entry : entrySet){
                if(entry.getValue() > count){
                    mostRepeatedWord = entry.getKey();
                    count = entry.getValue();
                }

            }
            System.out.println("Most repeated words in file : " + mostRepeatedWord);
            System.out.println("Number of occurences of most repeated words in file : " + count);

        }catch (IOException e){
            System.out.println(e);
        }finally {
            try {
                reader.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
}
