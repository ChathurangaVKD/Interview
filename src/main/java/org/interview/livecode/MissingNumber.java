package org.interview.livecode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 0, 1, 7, 2, 5, 4};
        int n = numbers.length;
        int expectedSum = n*(n + 1)/2;

        int actualSum = 0;
        for (int number: numbers)
            actualSum += number;
        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }
}
