package org.interview.livecode;

public class BinarySearch {
    public static int getItem(int [] n, int searchItem) {
        int left = 0;
        int right = n.length -1;
        while (left<=right) {
            int mid = left + (right - left)/2;
            if (n[mid]==searchItem)
                return mid;
            else if (n[mid]<searchItem)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String... args) {
        int [] inputNumbers = {1, 3, 8, 9, 11, 23, 90};
        int index = getItem(inputNumbers, 90);
        System.out.println(index);

    }
}
