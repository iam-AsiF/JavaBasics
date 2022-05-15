package com.SelfPractice;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {

        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value oh m: ");
        m = sc.nextInt();
        System.out.print("Enter the value oh n: ");
        n = sc.nextInt();

        // we need to use the m and n value before doing loop, else the value n will become always zero

        int o = m * n;

        // we can use Euclidean algorithm

        while(n != 0){
            int remainder = m % n;
            m = n;
            n = remainder;

        }
        int gcd = m;
        System.out.println("GCM = "+gcd);
        int lcm = o / gcd;
        System.out.println("LCM = "+lcm);

    }


}
