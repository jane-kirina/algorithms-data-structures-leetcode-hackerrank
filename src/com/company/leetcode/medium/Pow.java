package com.company.leetcode.medium;

public class Pow {
    public static double myPow(double x, int n) {
        return n < 0 ? 1 / pow(x, -n) : pow(x, n);
    }

    private static double pow(double x, int n) {
        if (n == 0 || x == 1) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        double result = pow(x, n / 2);
        result = result * result;

        return n % 2 == 0 ? result : result * x;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long duration = test();
        System.out.println("-------------------");
        System.out.println("Duration : " + duration);
    }

    private static final double test1x = 2.00000;
    private static final int test1n = 10;

    private static final double test2x = 2.10000;
    private static final int test2n = 3;

    private static final double test3x = 2.00000;
    private static final int test3n = -2;

    public static long test() {
        long startTime = System.nanoTime();

        System.out.println(test1x + ", " + test1n);
        System.out.println(myPow(test1x, test1n));
        System.out.println("1024.00000 - Expected");

        System.out.println("-------------------");

        System.out.println(test2x + ", " + test2n);
        System.out.println(myPow(test2x, test2n));
        System.out.println("9.26100 - Expected");

        System.out.println("-------------------");

        System.out.println(test3x + ", " + test3n);
        System.out.println(myPow(test3x, test3n));
        System.out.println("0.25000 - Expected");//Explanation: 2-2 = 1/22 = 1/4 = 0.25

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
