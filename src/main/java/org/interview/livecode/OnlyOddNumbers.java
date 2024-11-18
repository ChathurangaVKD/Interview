package org.interview.livecode;

import java.util.Arrays;

public class OnlyOddNumbers {
    public static boolean onlyOddNumbers(int[] nums) {
        return Arrays.stream(nums).parallel().allMatch(num -> num % 2 != 0);
    }

    public static void main(String [] args) {
        int[] oddNumbers = {1, 7, 81, 91};
        System.out.println(onlyOddNumbers(oddNumbers));
    }
}
