package com.PnT.Class;

public class CodingPractice12 {
    public static void main(String[] args) {
        CodingPractice12 myObj = new CodingPractice12();
        int result = myObj.sum();
        System.out.println(+result);
    }
    public int sum(){
        int a = 50, b = 20, sum = a+b;
        return sum;
        /* whenever we will use 'return' instead of 'print' function we
        have to ignore 'void' in the method name.

        If we don't use 'static' in the method line we can't call the
        function directly to the main method, and we need to make
        an object to call.
         */

    }


}
