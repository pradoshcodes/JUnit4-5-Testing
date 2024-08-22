package org.example.Service;

public class Calculator {

    public static int addTwo(int a,int b){
        return a+b;
    }

    public static int mulTwo(int a,int b){
        return a*b;
    }

    public static double divTwo(int a,int b){
        return a / b;
    }

    public static  int sumNum(int ...numbers){
        int s=0;
        for(int n:numbers){
            s+=n;
        }
        return s;
    }
}
