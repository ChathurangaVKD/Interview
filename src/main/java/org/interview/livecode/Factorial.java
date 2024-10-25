package org.interview.livecode;

public class Factorial {
    public static int getFactorial(int n) {
        if (n==0 || n==1)
            return n;
        return n * getFactorial(n-1);
    }

    public static void main(String[] args) {
        int inputNumber = 5;
        int facValue = getFactorial(inputNumber);
        System.out.println(facValue);
    }
}
