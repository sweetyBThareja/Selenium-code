package com.sweety.automation;
import java.util.*;

/**
 * Created by skumari on 2/22/2018.
 */
public class LambdaInCollections {
    public static void main(String args[]){
        List<AProduct> list = new ArrayList<AProduct>();
        list.add(new AProduct(1, "Ram" , 30000));
        list.add(new AProduct(2, "Shyam" , 488920));
        list.add(new AProduct(3, "Kiara" , 827393));

        System.out.println("Sorting on the basis of name");

        Collections.sort(list,(p1,p2)->{
        return p1.name.compareTo(p2.name);
        });

        for(AProduct p : list){
            System.out.println(p.id+" "+p.name+" "+p.salary);
        }

    }

}
