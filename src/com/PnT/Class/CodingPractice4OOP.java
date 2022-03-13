package com.PnT.Class;

public class CodingPractice4OOP extends CodingPractice3OOP{
    // This code copied from CodingPractice1OOP
    public static void main(String[] args) {

        //sum(30, 20); //won't work since we ignored static
        //sub(30, 20);

        //Object
        //making formula - className objectName = new className();

        CodingPractice4OOP myObj4 = new CodingPractice4OOP();
        myObj4.sum(10,5);
        myObj4.sub(20,10);

        multi(10,20);

    }
    protected static void sum(int a, int b){
        //int a = 10;
       // int b = 5;
        //what if we need to use random value?
        int sum  = a + b;
        System.out.println("Sum is = "+sum);
    }
    protected static void sub(int a, int b){
        // If we don't want to use static then we have to
        //make Object to call a specific method in the main body

        //int a = 10;
        //int b = 5;
        int sub  = a - b;
        System.out.println("Sub is = "+sub);
    }
}
