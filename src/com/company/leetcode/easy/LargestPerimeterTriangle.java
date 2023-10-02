package com.company.leetcode.easy;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long duration = test();
        System.out.println("-------------------");
        System.out.println("Duration : " + duration);
    }

    private static final int[] test1 = {2, 1, 2};
    private static final int[] test2 = {1, 2, 1, 10};

    public static long test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(largestPerimeter(test1));
        System.out.println("5 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(largestPerimeter(test2));
        System.out.println("0 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
