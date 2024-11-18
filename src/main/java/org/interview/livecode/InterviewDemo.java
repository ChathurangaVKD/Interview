package org.interview.livecode;

import java.util.Arrays;
import java.util.HashSet;

public class InterviewDemo {
    public static boolean palindrome(String name) {
        char[] nameArray = name.toCharArray();
        int left = 0;
        int right = nameArray.length - 1;

        for (char c: nameArray) {
            if (nameArray[left] != nameArray[right])
                return false;
            else {
                left++;
                right --;
            }
        }
        return true;
    }

    public static int fib(int number) {
         if (number <= 1)
             return number;

         return fib(number - 1) + fib(number - 2);
    }

    public static int fac(int n) {
        if (n <= 1)
            return 1;

        return n*fac(n-1);
    }

    public static int sum(int num) {
        if (num <= 1)
            return num;

        return num%10 + sum(num/10);
    }

    public static boolean isPrime(int num) {
        if (num <= 0)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0)
                return false;
        }
        return true;
    }

    public static <T> HashSet<T> findDuplicates(T[] list) {
        HashSet<T> duplicates = new HashSet<>();
        HashSet<T> storeList = new HashSet<>();

        Arrays.stream(list).forEach(t -> {
            if (storeList.contains(t))
                duplicates.add(t);
            else
                storeList.add(t);
        });

        return duplicates;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int n: nums) {
            if (max < n)
                max = n;
        }
        return max;
    }

    public static int findSecondMax(int[]  nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int n: nums) {
            if (max < n) {
                secondMax = max;
                max = n;
            } else if (secondMax < n && max > n) {
                secondMax = n;
            }
        }

        return secondMax;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left<=right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i=0; i< nums.length - 1; i++) {
            for (int j=0; j<nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] mergeSort(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] mergeArray = new int[nums1.length + nums1.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                mergeArray[k++] = nums1[i++];
            else
                mergeArray[k++] = nums2[j++];
        }

        while (i < nums1.length)
            mergeArray[k++] = nums1[i++];


        while (j < nums2.length)
            mergeArray[k++] = nums2[j++];

        return mergeArray;
    }

    public static boolean isAnagram(String name1, String name2) {
        char[] nameList1 = name1.toCharArray();
        char[] nameList2 = name2.toCharArray();

        Arrays.sort(nameList1);
        Arrays.sort(nameList2);

        return Arrays.equals(nameList1, nameList2);
    }

    public static void main(String[] args) {
//        System.out.println(isPrime(11));
        int[] nums1 = {1, 2, 4, 13, 42, 52};
        int[] nums2 = {11, 22, 42, 132, 422, 522};
        String [] names = {"aa", "bb", "a", "aa"};
        System.out.println(isAnagram("aDsun", "Dasun"));
    }
}
