package com.self.practice;

import java.util.Scanner;

public class ArrayMaxMinValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] number = new double[5];
        System.out.print("Please enter five numbers: ");
        for (int i = 0; i < 5; i++){
            number[i] = sc.nextDouble();
        }

        double max = number[0];
        double min = number[0];
        for (int i = 1; i < 5; i++){

            if (number[0] < number[i]){
                max = number[i];
            }
            if (number[0] > number[i] ){
                min = number[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}
