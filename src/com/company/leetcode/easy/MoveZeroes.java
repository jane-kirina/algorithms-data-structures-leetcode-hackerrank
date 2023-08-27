package com.company.leetcode.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int cur = 0;
        int temp;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public static void moveZeroesNonZero(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");
    }

    private static final int[] test1 = {0, 1, 0, 3, 12};
    private static final int[] test2 = {0};
    private static final int[] test3 = {0, 0, 1};
    private static final int[] test4 = {0, 0, 0, 0, 0, 0, 1, 1, 1};
    private static final String s = "Output -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        moveZeroes(test1);
        System.out.println(Arrays.toString(test1));
        System.out.println("[1, 3, 12, 0, 0] - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        moveZeroes(test2);
        System.out.println(Arrays.toString(test2));
        System.out.println("[0] - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test3));
        moveZeroes(test3);
        System.out.println(Arrays.toString(test3));
        System.out.println("[1, 0, 0] - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test4));
        moveZeroes(test4);
        System.out.println(Arrays.toString(test4));
        System.out.println("[1, 1, 1, 0, 0, 0, 0, 0, 0] - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }

    public static void testNonZero() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        moveZeroesNonZero(test1);
        System.out.println(Arrays.toString(test1));
        System.out.println("[1, 3, 12, 0, 0] - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        moveZeroesNonZero(test2);
        System.out.println(Arrays.toString(test2));
        System.out.println("[0] - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test3));
        moveZeroesNonZero(test3);
        System.out.println(Arrays.toString(test3));
        System.out.println("[1, 0, 0] - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test4));
        moveZeroesNonZero(test4);
        System.out.println(Arrays.toString(test4));
        System.out.println("[1, 1, 1, 0, 0, 0, 0, 0, 0] - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
