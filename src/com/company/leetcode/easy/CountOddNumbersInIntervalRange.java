package com.company.leetcode.easy;

public class CountOddNumbersInIntervalRange {
    public static int countOddsLoop(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOddsCheck(int low, int high) {
        int count = (high - low) / 2;

        if (high % 2 == 1 || low % 2 == 1) {
            count++;
        }

        return count;
    }

    public static int countOddsSimple(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long durationLoop = testLoop();
        long durationCheck = testCheck();
        long durationSimple = testSimple();
        System.out.println("-------------------");
        System.out.println("Duration LOOP:   " + durationLoop);
        System.out.println("-------------------");
        System.out.println("Duration CHECK:  " + durationCheck);
        System.out.println("-------------------");
        System.out.println("Duration SIMPLE: " + durationSimple);
    }

    private static final String s = "Output -> ";

    public static long testSimple() {
        long startTime = System.nanoTime();

        System.out.println("low = 3, high = 7");
        System.out.println(countOddsSimple(3, 7));
        System.out.println("3 - Expected");

        System.out.println("-------------------");

        System.out.println("low = 8, high = 10");
        System.out.println(countOddsSimple(8, 10));
        System.out.println("1 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long testCheck() {
        long startTime = System.nanoTime();

        System.out.println("low = 3, high = 7");
        System.out.println(countOddsCheck(3, 7));
        System.out.println("3 - Expected");

        System.out.println("-------------------");

        System.out.println("low = 8, high = 10");
        System.out.println(countOddsCheck(8, 10));
        System.out.println("1 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long testLoop() {
        long startTime = System.nanoTime();

        System.out.println("low = 3, high = 7");
        System.out.println(countOddsLoop(3, 7));
        System.out.println("3 - Expected");

        System.out.println("-------------------");

        System.out.println("low = 8, high = 10");
        System.out.println(countOddsLoop(8, 10));
        System.out.println("1 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
