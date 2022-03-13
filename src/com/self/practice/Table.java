package com.self.practice;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m;
        System.out.println("Suppose 'm' is the number for which you want a table.");
        System.out.println("The value of 'm' should be between '1 to 10.'");
        System.out.print("So put the value of 'm': ");
        m = input.nextInt();

        // let's use Nested Loop and see if it works

        for(int i = 1; i <= 10; i++){

            int k = m * i;
            System.out.println(+m+" x "+i+" = "+k);
            }
        }

    }
