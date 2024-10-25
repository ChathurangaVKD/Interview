package org.interview.livecode;

public class RemoveVowels {
    private static String removeVowels(String string) {
        return string.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String... args) {
        String string = "Dasun";
        String removedVowelString = removeVowels(string);
        System.out.println(removedVowelString);

    }
}
