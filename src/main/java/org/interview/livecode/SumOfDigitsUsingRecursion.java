package org.interview.livecode;

public class SumOfDigitsUsingRecursion {
    private static int findSum(int number) {
        if (number == 0)
            return number;
        return number % 10 + findSum(number/10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int sum = findSum(number);
        System.out.println("sum: " + sum);
    }
}
