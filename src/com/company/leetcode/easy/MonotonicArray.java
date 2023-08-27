package com.company.leetcode.easy;

import java.util.Arrays;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                dec = false;

            } else if (nums[i] > nums[i + 1]) {
                inc = false;
            }

            if (!inc && !dec) {
                return false;
            }
        }

        return true;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");
    }

    private static final int[] test1 = {1, 2, 2, 3};
    private static final int[] test2 = {6, 5, 4, 4};
    private static final int[] test3 = {1, 3, 2};
    private static final String s = "Output -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(isMonotonic(test1));
        System.out.println("true - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(isMonotonic(test2));
        System.out.println("true - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test3));
        System.out.println(isMonotonic(test3));
        System.out.println("false - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
