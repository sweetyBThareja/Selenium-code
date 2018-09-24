package com.Practise;

import java.lang.annotation.ElementType;

public class JavaPractise1 {

    public static void main(String args[]){
//        fact(5);
//       System.out.println(factRecursion(5));
//        fabonacciSeries(10);

//        boolean res = primeNumber(13);
//        if(res){
//            System.out.println("Number is prime");
//        }else {
//            System.out.println("Number is not prime");
//        }
//        //Prime numbers b/w two numbers
//        for(int i = 0; i < 100; i ++){
//            if(primeNumber(i)){
//                System.out.print(i + " ");
//            }
//        }
      //  pyramid();
//        evenNumber(5);
//        table(2);
     //   armstrongNumber(153);
      //  reverseNumber(1234);
      //  floydTriangle();
       // addMatrices();
       // multipleMatrices();
       // swapTwoNumbers(10,20);
       // swapWithoutTemp(10,20);
        String str = "a1@b1$";
        char [] ch = str.toCharArray();
        for(int i = 0; i< ch.length; i++){
        if(String.valueOf(str.charAt(i)).matches("[a-zA-Z]")){
            if(String.valueOf(str.charAt(i+1)).matches("\\d")){
                char temp;
                temp = ch[i];
                ch[i] = ch[i+1];
                ch[i+1] = temp;
            }
        }

        }
        System.out.println(new String(ch));
    }
    public static void multipleMatrices(){
        int [][] matrix1 = {{1,1,1},{2,2,2},{3,3,3}};
        int [][] matrix2 = {{1,1,1},{2,2,2},{3,3,3}};
        int [][] matrixSum = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j =0; j< 3; j++){
                for(int k=0; k< 3; k++){
                    matrixSum[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(matrixSum[i][j] +" ");
            }
            System.out.println();
        }
    }
    static public void addMatrices(){
        int [][] matrix1 = {{2,3,4},{2,9,3},{4,5,7}};
        int [][] matrix2 = {{3,5,6},{8,4,5},{8,4,6}};
        int [][] matrixSum = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j =0; j< 3; j++){
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i=0; i<3;i++){
            for(int j = 0; j<3; j++){
            System.out.print(matrixSum[i][j] +" ");
        }
        System.out.println();
        }

    }
   static int num = 1;
    public static void floydTriangle(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void reverseNumber(int n) {
        int rev = 0, sum = 0;
        while (n > 0){
            rev = n % 10;
            sum = sum * 10 + rev;
            n = n / 10;
        }
        System.out.println("reverse of number is: " + sum);


    }
    public static void armstrongNumber(int n){
        int temp = n,a,c=0;
        while (n>0){
            a = n%10;
            n = n/10;
            c = c + (a*a*a);
        }
        if(temp == c){
            System.out.println("Number is armstrong");
        }else {
            System.out.println("Number is not armstrong");
        }
    }
    static int i = 1;
    public static void table(int n){

        while (i<=10){
            System.out.print(n*i + " ");
            i++;
        }
    }

    public static void fact(int n){
        int fact = 1;
       for(int i = 1; i<=n; i++){
          fact = fact * i;
       }
       System.out.println("Factorial of number: " + fact);
    }

    public static int factRecursion(int n){
        if(n==0){
            return 1;
        }else {
            return (n*factRecursion(n-1));
        }
    }

    public static void fabonacciSeries(int n){
        int a = 0, b = 1, c = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 0; i< n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        //or
        int i = 0;
        while (i < n){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }

    public static boolean primeNumber(int n){
        boolean flag = true;
        if(n == 1 || n == 0){
            flag = false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                flag = false;
                break;
            }

        }
        //or
//        for(int i = 2; i <= Math.sqrt(n); i++){
//            if(n % i == 0){
//                flag = true;
//                break;
//            }
//
//        }
        return flag;
    }

    public static void pyramid(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < 5; i++){
            for(int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int i, space, k=0;
        for(i=1; i<=5; i++)
        {
            for(space=1; space<=(5-i); space++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            k = 0;
            System.out.println();
        }
        for(int i1 = 1; i1<=4; i1++){
            for(int j = 1; j<=4; j++){
                if(i1==1 || i1 == 4 || j == 1 || j==4)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void evenNumber(int n){
        if(n%2 == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }

    public static void swapTwoNumbers(int a, int b){
        int temp;
        temp =  a;
        a = b;
        b = temp;
        System.out.println("After swapping value of a= " + a);
        System.out.println("After swapping value of b= " + b);
        }

        public static void swapWithoutTemp(int a, int b){
          a = a+b;
          b = a-b;
          a = a-b;
            System.out.println("After swapping value of a= " + a);
            System.out.println("After swapping value of b= " + b);
        }

    }
