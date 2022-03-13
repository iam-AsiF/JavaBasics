package com.PnT.Class;

import java.util.Scanner;

public class CodingPractice11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String Name = sc.nextLine(); //nextLine will count the whole line of a string
        //String Name = sc.next(); // next will count the first word of a string
        System.out.println(Name.toUpperCase());

    }

}
