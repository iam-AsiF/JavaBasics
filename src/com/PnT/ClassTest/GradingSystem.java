package com.PnT.ClassTest;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        GradingCalculator();
    }
    public static void GradingCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = sc.nextInt();

        if (a >= 80 && a <= 100){
            System.out.println("Grade A+");
        }
        if (a >= 70 && a <= 79){
            System.out.println("Grade A");
        }
        else if (a >= 60 && a <= 69){
            System.out.println("Grade A-");
        }
        else if (a >= 50 && a <= 59){
            System.out.println("Grade B");
        }
        else if (a >= 40 && a <= 49){
            System.out.println("Grade C");
        }
        else if (a >= 33 && a <= 39){
            System.out.println("Grade D");
        }
        else if (a >= 0 && a <= 32){
            System.out.println("Grade F");
        }
        else {
            System.out.println("Invalid Marks");
        }
    }
}
