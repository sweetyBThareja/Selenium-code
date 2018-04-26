package com.sweety.automation;

/**
 * Created by skumari on 2/13/2018.
 */
//Without lambda
interface Drawable {
    public void draw();
}

interface Sayable {
    public String say();
}

interface SayableP {
    public String says(String name);
}

interface Addable {
    public int add(int a, int b);
}

interface Subtract {
    public int sub(int a, int b);
}

public class ALambdaExpression {
//    String name = "Ram";
//    int age = 4;
//    public static void main(String args[]) {
//        ALambdaExpression obj = new ALambdaExpression();
//        obj.draw();
//    }
//
//    public void draw() {
//        System.out.println("Name is: " + name + " and age is: " + age);
//    }

    //With lambda:
    public static void main(String args[]) {
        String name = "Ram";
        int age = 4;

//        Drawable d2 = () -> {
//            System.out.println("I am lambda Expression");
//            System.out.println("Name is: " + name + " and age is: " + age);
//        };
//        d2.draw();
        // Lambda without parameter
//        Sayable s = () -> {
//            return "I have nothing to return";
//        };
//        System.out.println(s.say());

        //Lambda with parameter

//        SayableP s1 = (names) -> {
//            return "I have one parameter " + names;
//        };
//        System.out.println(s1.says(name));

        //With return and no return:
        //Without return
        Addable a = (c, b) -> (c + b);
        System.out.println(a.add(10, 20));
        //With return
        Addable a1 = (int d, int e) -> {
            return (d + e);
        };
        System.out.println(a1.add(30, 40));

        Subtract s = (t, b) -> (t - b);
        System.out.println(s.sub(25,10));

        Subtract s1 = (e, f) -> {
            return (e - f);
        };
        System.out.println(s1.sub(34,23));

        //Multiple statements:
        SayableP S2 = (message) -> {
            String str1 = "I would like to say";
            String str2 = str1 + message;
            return str2;
        };

        System.out.println(S2.says("I love to read java"));

    }


}
