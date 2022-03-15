package com.PnT.ClassTest;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        productOfTwo();
    }
    public static void productOfTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a: ");
        int a = sc.nextInt();
        System.out.println("enter value of b: ");
        int b = sc.nextInt();
        int pro = a * b;
        System.out.println(a+" * "+b+" = "+pro);

    }

}
