package org.interview.livecode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxElement {
    private static int findMax(int[] array) {
        AtomicInteger max = new AtomicInteger();
        Arrays.stream(array).forEach(item -> {
            if (max.get() <item)
                max.set(item);
        });

        return max.get();
    }

    private static int findSecondMax(int[] array) {
        AtomicInteger max = new AtomicInteger();
        AtomicInteger secondMax = new AtomicInteger();

        Arrays.stream(array).forEach(item -> {
            if (max.get() < item)
                max.set(item);
            else if (secondMax.get() < item)
                secondMax.set(item);
        });

        return secondMax.get();
    }

    public static void main(String[] args) {
        int [] array = {1, 3, 4, 5, 7, 84, 65};

        int maxValue = findMax(array);
        System.out.println("maxValue: " + maxValue);

        int secondMaxValue = findSecondMax(array);
        System.out.println("secondMaxValue: " + secondMaxValue);
    }
}