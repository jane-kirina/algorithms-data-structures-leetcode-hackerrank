package com.company.leetcode.easy;

import java.util.Arrays;

public class SignOfProductOfArray {
    public static int arraySign(int[] nums) {
        int num = 0;

        for (int i : nums) {
            if (i == 0) {
                return 0;
            }

            if (i < 0) {
                num++;
            }
        }
        return num % 2 == 0 ? 1 : -1;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");
    }

    private static final int[] test1 = {-1,-2,-3,-4,3,2,1};
    private static final int[] test2 = {1,5,0,2,-3};
    private static final int[] test3 = {-1,1,-1,1,-1};
    private static final String s = "Output -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(arraySign(test1));
        System.out.println("1 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(arraySign(test2));
        System.out.println("0 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test3));
        System.out.println(arraySign(test3));
        System.out.println("-1 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
