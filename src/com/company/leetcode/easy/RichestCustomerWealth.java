package com.company.leetcode.easy;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int countOfBanks = accounts[0].length;

        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < countOfBanks; j++) {
                temp += accounts[i][j];
            }

            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }


    /**
     * TEST
     **/
    public static void main(String[] args) {
        long duration = test();
        System.out.println("-------------------");
        System.out.println("Duration : " + duration);
    }

    private static final int[][] test1 = {{1, 2, 3}, {3, 2, 1}};
    private static final int[][] test2 = {{1, 5}, {7, 3}, {3, 5}};
    private static final int[][] test3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

    private static final String s = "Output -> ";

    public static long test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.deepToString(test1));
        System.out.println(maximumWealth(test1));
        System.out.println("6 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.deepToString(test2));
        System.out.println(maximumWealth(test2));
        System.out.println("10 - Expected");

        System.out.println("-------------------");
        System.out.println(Arrays.deepToString(test3));
        System.out.println(maximumWealth(test3));
        System.out.println("17 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
