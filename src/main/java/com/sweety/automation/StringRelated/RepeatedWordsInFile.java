package com.sweety.automation.StringRelated;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class RepeatedWordsInFile {
    public static void main(String[] args)
    {
        //Creating wordCountMap which holds words as keys and their occurrences as values

        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

        BufferedReader reader = null;

        try
        {

            reader = new BufferedReader(new FileReader("D:\\testout.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                String[] words = currentLine.toLowerCase().split(" ");
                for (String word : words)
                {
                    if(wordCountMap.containsKey(word))
                    {
                        wordCountMap.put(word, wordCountMap.get(word)+1);
                    }
                    else
                    {
                        wordCountMap.put(word, 1);
                    }
                }
                currentLine = reader.readLine();
            }
            Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();
            List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(entrySet);
            Collections.sort(list, new Comparator<Entry<String, Integer>>()
            {
                @Override
                public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2)
                {
                    return (e2.getValue().compareTo(e1.getValue()));
                }
            });
            System.out.println("Repeated Words In Input File Are :");
            for (Entry<String, Integer> entry : list)
            {
                if (entry.getValue() > 1)
                {
                    System.out.println(entry.getKey() + " : "+ entry.getValue());
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

