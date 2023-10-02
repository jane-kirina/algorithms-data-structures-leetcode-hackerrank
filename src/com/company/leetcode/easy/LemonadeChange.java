package com.company.leetcode.easy;

import java.util.Arrays;

public class LemonadeChange {
    public static boolean lemonadeChange1(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five <= 0) {
                    return false;
                }
                ten++;
                five--;
            } else {
                if (five < 3 && (ten * five <= 0)) {
                    return false;
                }
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
        }
        return true;
    }

    public static boolean lemonadeChange2(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                ten++;
                five--;
            } else {
                if (five==0 ||(ten==0 && five<3)) {
                    return false;
                }
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
        }
        return true;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long duration = test();
        System.out.println("-------------------");
        System.out.println("Duration : " + duration);
    }

    private static final int[] test1 = {5, 5, 5, 10, 20};
    private static final int[] test2 = {5, 5, 10, 10, 20};
    private static final int[] test3 = {5, 5, 5, 10, 5, 5, 10, 20, 20, 20};

    public static long test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(lemonadeChange1(test1));
        System.out.println("true - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(lemonadeChange1(test2));
        System.out.println("false - Expected");

        System.out.println("-------------------");
        System.out.println(Arrays.toString(test3));
        System.out.println(lemonadeChange1(test3));
        System.out.println("false - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
