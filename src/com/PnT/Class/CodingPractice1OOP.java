package com.PnT.Class;

public class CodingPractice1OOP {
    public static void main(String[] args) {

        sum(30, 20);
        sub(30, 20);
        // here the value a,b is called parameter
        /*
        Now if we want to use random value we need
        put those values by ourselves in the method command
        which is on the top command
         */
    }
    public static void sum(int a, int b){
        // here int a, int b called argument
        //int a = 10;
       // int b = 5;
        //what if we need to use random value?
        int sum  = a + b;
        System.out.println("Sum is = "+sum);
    }
    public static void sub(int a, int b){
        //int a = 10;
        //int b = 5;
        int sub  = a - b;
        System.out.println("Sub is = "+sub);

        /* Here, the thing is it will not print anything
        since in JAVA the only print function will work if
        and only if the print function is in the 'main' body
        so, we need to call every specific method to the main
        body to print
         */
    }
}
