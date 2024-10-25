package org.interview.livecode;

public class Fibonacci {
    public static int fib(int n) {
        if (n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        // print fib value for particular index, 9 -> 34
        int inputNumber = 9;
        int fibValue = fib(inputNumber);
        System.out.println("fibValue for \"" + inputNumber + "\": " + + fibValue);

        // print Fibonacci series for provide index number, 10 -> 0	1	1	2	3	5	8	13	21	34
        int fibonacciSeries = 10;
        System.out.print("fibonacciSeries: ");
        for (int i=0; i<10;i++){
           System.out.print( fib(i) + "\t");
        }
    }
}
