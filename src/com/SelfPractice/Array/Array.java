package com.SelfPractice.Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //We need to use new operator to make an array
        //format-> data_type[] array_name = new data_type[array_size]

        /*int[] number = new int[5]; // 5 means index number (0 - 4)

        number[0] = 10;
        number[1] = 11;
        number[2] = 12;
        number[3] = 13;
        number[4] = 14;

        //System.out.println(number[3]);
        //System.out.println(number.length); // find array's length

        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("Sum of array's numbers = "+sum);
        */

        //..........................................................................

        /*Scanner sc = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;

        System.out.println("Please enter five numbers: ");


        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("sum of array numbers = "+sum);
         */

        //..................................................................................

        Scanner sc = new Scanner(System.in);
        double[] number = new double[5];
        System.out.print("Please enter five numbers: ");
        double sum = 0;

        /*number[0] = sc.nextDouble();
        number[1] = sc.nextDouble();
        number[2] = sc.nextDouble();
        number[3] = sc.nextDouble();
        number[4] = sc.nextDouble();
        */
        //OR using a loop
        for (int i =0; i < 5; i++){
            number[i] = sc.nextDouble();
        }
        //sum = number[0] + number[1] + number[2] + number[3] + number[4];
        // OR using a loop
        for (int i =0; i < 5; i++){
            sum = sum + number[i];
        }
        System.out.println("sum of array numbers = "+sum);
        double avg = sum / number.length;
        System.out.println("Array sum's average = "+avg);
    }

}
