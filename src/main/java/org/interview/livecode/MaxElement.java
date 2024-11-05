package org.interview.livecode;

public class MaxElement {
    private static void findFirstAndSecondMax(int[] array) {
        int max = array[0];
        int secondMax = array[0];

        for (int number: array) {
            if (max<number) {
                secondMax = max;
                max = number;
            } else if (secondMax < number && max > number)
                secondMax = number;
        }
        System.out.println("maxValue: " + max);
        System.out.println("secondMaxValue: " + secondMax);
    }

    public static void main(String[] args) {
        int [] array = {1, 3, 4, 5, 711, 1112};
        findFirstAndSecondMax(array);
    }
}