package com.PnT.Class;

import java.util.Random;
import java.util.Scanner;

public class CodingPractice8 {
    public static void main(String[] args) {
        // Generate a random number
        // r >= 5 means it will create 5 random numbers
        // bound: 100 means random number will be created between 1 and 100

        int r;
        Random rn=new Random();
        for (r = 1; r <= 5; r++){
            System.out.println(rn.nextInt(100));
        }
    }

}
