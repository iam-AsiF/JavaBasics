package com.PnT.Class;

import java.util.Scanner;

public class CodingPractice7 {
    public static void main(String[] args) {
        //series addition of even numbers

        int sum = 0;
        for (int i = 1; i  <= 100; i++){
            if (i %2 == 0){
                sum = sum +i;
            }
     }
        System.out.println("Sum of evens form 1 to 100 = "+sum);

        // finding the square value of a number

        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();

        int square = a * a;

        System.out.println("Square value = "+square);

    }

}
