package com.company.leetcode.medium;

import java.util.Arrays;

public class MaximumSubarray {
    private static int maxSubArray(int [] nums) {
        int max = nums[0];
        int sum = 0;

        for (int num : nums) {
            if (sum < 0) {
                sum = 0;
            }
            sum += num;
            max = Math.max(max, sum);
        }
        return max;
    }


    /**
     * TEST
     **/
    public static void main(String[] args) {
        naiveTest();
        System.out.println("-------------------");

    }

    private static final int[] test1 = {-2,1,-3,4,-1,2,1,-5,4};
    private static final int[] test2 = {1};
    private static final int[] test3 = {5,4,-1,7,8};
    private static final String s = " -> ";

    public static void naiveTest() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1) + s + maxSubArray(test1));
        System.out.println(Arrays.toString(test2) + s + maxSubArray(test2));
        System.out.println(Arrays.toString(test3) + s + maxSubArray(test3));

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
