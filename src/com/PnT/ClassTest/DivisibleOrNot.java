package com.PnT.ClassTest;

import org.w3c.dom.ls.LSOutput;

public class DivisibleOrNot {
    public static void main(String[] args) {
        divisibleByThree();
        divisibleByFive();
        divisibleByThreeAndFive();
    }
    public static void divisibleByThree(){
        System.out.println("\nDivisible by 3: ");
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void divisibleByFive(){
        System.out.println("\nDivisible by 5: ");
        for (int i = 1; i <=100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void divisibleByThreeAndFive(){
        System.out.println("\nDivisible by 3 and 5: ");
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(+i);
            }
        }
    }

}
