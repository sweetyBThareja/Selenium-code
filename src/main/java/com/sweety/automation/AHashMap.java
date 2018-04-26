package com.sweety.automation;
import java.util.*;


/**
 * Created by skumari on 2/20/2018.
 */
public class AHashMap {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Sweety", 1);
        map.put("Rajat", 2);
        map.put("Kiara", 3);
        map.put("Myra", 4);
        System.out.println(map.get("Kiaras"));
        System.out.println(map.get("Rajat"));
        for(Map.Entry m:map.entrySet()){
           System.out.println(m.getKey() + " " + m.getValue());
        }

        //old method to traverse Map:
        System.out.println("Traversing map by old method:");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
