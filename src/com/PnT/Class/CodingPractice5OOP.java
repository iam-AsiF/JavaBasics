package com.PnT.Class;

public class CodingPractice5OOP {
    // This code copied from CodingPractice4OOP
    public static void main(String[] args) {
        /*
        in order to call method from 4OOP we need to make
        object again. also, we need to change the access modifier
        from private to protected in the 4OOP so that we can use
        those methods within the same package.
         */
        CodingPractice5OOP myObj5 = new CodingPractice5OOP();

        CodingPractice4OOP myObj4 = new CodingPractice4OOP();
        myObj4.sum(50,20);
        myObj4.sub(50,20);
    }

}