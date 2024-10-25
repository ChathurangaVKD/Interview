package org.interview.livecode;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    private static void findDuplicates(int[] list) {
        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> storeList = new HashSet<>();

        Arrays.stream(list).forEach(item -> {
            if (storeList.contains(item)) {
                duplicates.add(item);
            }
            storeList.add(item);
        });

        System.out.println(duplicates);
    }

    public static void main(String[] args) {
        int [] list = {3, 4, 4, 5, 5, 55, 43, 55, 5};
        findDuplicates(list);
    }
}
