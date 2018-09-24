package com.sweety.automation.StringRelated;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Lambda {

    //Remove duplicates:

    public static void main(String args[]){
        List<Integer> listWithDuplicates = Arrays.asList(67, 8, 4, 21, 25, 64, 76, 52, 4, 21);
        List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);

        //Occurrence of chars:
        String s = "abcaba";
        Map<Character, Integer> frequencies = s.chars().boxed()
                .collect(toMap(
                        // key = char
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,         // 1 occurence
                        Integer::sum)); // counting
        System.out.println("Frequencies:\n" + frequencies);
        //The String.chars() method returns IntStream of characters, so we have to box them to Integer to resolve type problems in Collector.

    }
}
