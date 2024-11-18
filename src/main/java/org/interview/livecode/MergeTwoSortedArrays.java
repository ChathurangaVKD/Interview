package org.interview.livecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void merge(int[] nums1, int[] nums2) {
        List<Integer> mergedList = new ArrayList<>();

        // merging arrays
        for (int i : nums1) mergedList.add(i);
        for (int j : nums2) mergedList.add(j);

        // sorting array
        sortArray(mergedList);

        // Print sorted merged list
        mergedList.forEach(System.out::println);
    }

    public static void sortArray(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = 0; j < nums.size() - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, j + 1);
                    nums.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 6, 10, 18, 90, 129};
        int[] a2 = {12, 22, 112, 231};
//        merge(a1, a2);
        System.out.println(Arrays.toString(mergeTwoSortedArray(a1, a2)));
    }

    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them into mergedArray
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < m) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
