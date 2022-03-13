package com.PnT.Class;

public class CodingPractice2OOP {
    public static void main(String[] args) {

        multi();
        div();
    }
    public static void multi(){
        int a = 10;
        int b = 5;
        int multi  = a * b;
        System.out.println("Multi is = "+multi);
    }

    // See CodingPractice1OOP for random value taking technique

    public static void div(){
        int a = 10;
        int b = 5;
        int div  = a / b;
        System.out.println("Div is = "+div);

        /* Here, the thing is it will not print anything
        since in JAVA the only print function will work if
        and only if the print function is in the 'main' body
        so, we need to call every specific method to the main
        body to print
         */
    }
}
