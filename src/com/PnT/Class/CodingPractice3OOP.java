package com.PnT.Class;

import static com.PnT.Class.CodingPractice1OOP.sub;
import static com.PnT.Class.CodingPractice1OOP.sum;

public class CodingPractice3OOP {
    public static void main(String[] args) {
        /*
        To import, first write the method name and
        hold the mouse on it, and it will tell us to import them
         */
        sum(50, 20);
        sub(50, 20);

        /*
        if we don't want to import we can use another way
        by putting the class_name.method_name
         */
        CodingPractice2OOP.multi();
        CodingPractice2OOP.div();


    }
    /* Here, the thing is it will not print anything
        since in JAVA the only print function will work if
        and only if the print function is in the 'main' body
        so, we need to call every specific method to the main
        body to print

        also, we can call any method anywhere by simply calling
        them and importing them
         */

    public static void multi(int a, int b){
        int multi = a * b;
        System.out.println("Multi is = "+multi);
    }
}
