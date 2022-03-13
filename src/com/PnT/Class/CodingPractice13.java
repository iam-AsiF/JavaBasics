package com.PnT.Class;

public class CodingPractice13 {
    public static  int a = 10, b = 5;
    public static void main(String[] args) {

    }
    public static void sum(){
        int sum = a+b;
        System.out.println("Sum is = "+sum);
    }
    public static void sub(){
        int sub = a-b;
        System.out.println("Sub is = "+sub);
    }
    /* int a = 5, b = 10;
    if we use this in the 'method' body it will be called local value.
    if we use this in the 'class' body it will be called global value.
    Global value writing format - public static int a, b;

    Global value can be used in both method.
    method value is only accessible within the method.
     */
}
