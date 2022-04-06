package com.self.practice;
public class Array_Quiz {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {1, 2};
        System.out.println( arr1 == arr2);
        System.out.println(arr1[1] == arr2[1]);

        /*Here, the first sout is checking whether the memory location of the
        arrays are the same or not.
        Second sout will check whether the index value 1 of the both arrays are
        equal or not.
         */
    }
}