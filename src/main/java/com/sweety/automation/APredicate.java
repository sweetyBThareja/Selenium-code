package com.sweety.automation;

import java.util.function.Predicate;

/**
 * Created by skumari on 2/22/2018.
 */

public class APredicate {
    public static void main(String args[]){
        Predicate<Integer> p = a -> (a > 18); //creating lambda expression
        System.out.println(p.test(20)); //Calling predicate method
        //Use default methods of predicate:
        Predicate<String> pr = S -> {
            return S.equals("Hello");
        };

        System.out.println("Default method AND");
        Predicate<String> prest = pr.and(S->(S.length()>4));
        System.out.println(prest.test("Hello"));
        System.out.println(prest.test("javaa"));

        System.out.println("Default method OR");
        Predicate<String> presti = pr.or(S->(S.length()>4));
        System.out.println(presti.test("Hello"));
        System.out.println(presti.test("java"));

        System.out.println("Default method Negation");
        Predicate<String> predicateNegate = pr.negate();
        System.out.println(predicateNegate.test("Hello"));

    }
}
