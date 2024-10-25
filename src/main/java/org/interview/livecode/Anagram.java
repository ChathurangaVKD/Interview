package org.interview.livecode;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String name1 = "Dasun";
        String name2 = "Dsaun";
        checkIsAnagram(name1, name2);
    }

    private static void checkIsAnagram(String name1, String name2) {
        char[] name1Char = name1.toCharArray();
        char[] name2Char = name2.toCharArray();
        Arrays.sort(name1Char);
        Arrays.sort(name2Char);

        boolean isAnagram = Arrays.equals(name1Char, name2Char);
        System.out.println(isAnagram);
    }
}
