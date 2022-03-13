package com.PnT.Class;

import java.util.Scanner;

public class CodingPractice4 {
    public static void main(String[] args) {
        
        int a;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        if(a >= 10){
            System.out.println("Good");
        }
        else {
            System.out.println("Bad");
        }

    }

}
