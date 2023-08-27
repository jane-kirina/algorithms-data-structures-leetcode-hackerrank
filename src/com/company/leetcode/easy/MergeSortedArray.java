package com.company.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static String mergeNaive(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }

        Arrays.sort(nums1);
        return Arrays.toString(nums1);
    }

    public static String mergeWhile(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        return Arrays.toString(nums1);
    }


    public static void main(String[] args) {
        System.out.println(mergeNaive(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3));
        System.out.println(mergeNaive(new int[]{1}, 1, new int[]{}, 0));
        System.out.println(mergeNaive(new int[]{0}, 0, new int[]{1}, 1));
        System.out.println("------");
        System.out.println(mergeWhile(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3));
        System.out.println(mergeWhile(new int[]{1}, 1, new int[]{}, 0));
        System.out.println(mergeWhile(new int[]{0}, 0, new int[]{1}, 1));

        System.out.println("------");

        long startTime2 = System.nanoTime();
        mergeNaive(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        long endTime2 = System.nanoTime();
        long durationNaive = (endTime2 - startTime2);

        long startTime = System.nanoTime();
        mergeWhile(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        long endTime = System.nanoTime();
        long durationWhile = (endTime - startTime);

        System.out.println("Using Naive: " + durationNaive);
        System.out.println("Using While: " + durationWhile);
    }
}
