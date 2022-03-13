package com.PnT.Class;

import java.util.Scanner;

public class CodingPractice2 {
    public static void main(String[] args) {

        int a, b;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = sc.nextInt();
        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;

        System.out.println("Sum is = "+sum);
        System.out.println("Sub is = "+sub);
        System.out.println("Multi is = "+multi);
        System.out.println("Div is = "+div);

    }

}
