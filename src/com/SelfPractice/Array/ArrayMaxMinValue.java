package com.SelfPractice.Array;

import java.util.Scanner;

public class ArrayMaxMinValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;

        System.out.print("Please enter five numbers: ");
        for (int i = 0; i < number.length; i++){
            number[i] = sc.nextDouble();
        }

        for (int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        double avg = sum / number.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);

        //Finding maximum and minimum number
        double max = number[0];
        double min = number[0];
        for (int i = 1; i < number.length; i++){
            //since we already took num[0] as max so, we start from num[1]

            if (number[0] < number[i]){
                max = number[i];
            }
            if (number[0] > number[i] ){
                min = number[i];
            }
        }
        System.out.println("Maximum number = "+max);
        System.out.println("Minimum number = "+min);
    }
}
