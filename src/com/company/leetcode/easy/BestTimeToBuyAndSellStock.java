package com.company.leetcode.easy;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int price : prices) {
            if (min > price) {
                min = price;
            }
            if (profit < price - min) {
                profit = price - min;
            }
        }

        return profit;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");

    }

    private static final int[] test1 = {7, 1, 5, 3, 6, 4};
    private static final int[] test2 = {7, 6, 4, 3, 1};
    private static final String s = "Output -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(s + maxProfit(test1));
        System.out.println("Expected: 5");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(s + maxProfit(test2));
        System.out.println("Expected: 0");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("-------------------");
        System.out.println("Duration: " + duration);
    }
}
