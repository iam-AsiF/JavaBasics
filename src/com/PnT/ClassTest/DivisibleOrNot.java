package com.PnT.ClassTest;

public class DivisibleOrNot {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0) {
                System.out.println("Numbers divisible by 3 = " + i);
            }
        }
        System.out.println("..........................................................");
        for (int i = 1; i <=100; i++) {
            if (i % 5 == 0) {
                System.out.println("Numbers divisible by 5 = " + i);
            }
        }
        System.out.println("..........................................................");
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Numbers divisible both by 3 and 5 = "+i);
            }
        }
    }
}
