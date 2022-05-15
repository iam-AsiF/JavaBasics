package com.SelfPractice.Array;

public class ForEachLoop {
    public static void main(String[] args) {

        /*String[] names = {"Asif", "Riad", "Binoy", "Annando"};

        for (String x : names){
            System.out.println(x);
        }*/

        int[] names = {1, 10, 52, 14, 20, 22};
        int sum = 0;
        for (int x : names){
            sum = sum + x;
        }
        System.out.println(sum);

    }
}
