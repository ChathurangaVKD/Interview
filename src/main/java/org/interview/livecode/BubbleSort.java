package org.interview.livecode;

import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[] array) {
        for (int i=0; i<array.length - 1; i++) {
            for (int j=0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 2, 0, 7, 5, 3, 4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
