package com.company.leetcode.easy;

import java.util.Arrays;

public class ArithmeticProgressionFromSequence {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
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

    private static final int[] test1 = {3, 5, 1};
    private static final int[] test2 = {1, 2, 4};
    private static final String s = "Output -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(canMakeArithmeticProgression(test1));
        System.out.println("true - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(canMakeArithmeticProgression(test2));
        System.out.println("false - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
