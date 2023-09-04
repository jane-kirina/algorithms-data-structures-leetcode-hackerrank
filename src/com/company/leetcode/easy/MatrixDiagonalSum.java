package com.company.leetcode.easy;

import java.util.Arrays;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            if (i != (mat.length - 1 - i)) {
                sum += mat[i][mat.length - 1 - i];
            }
        }

        return sum;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long duration = test();
        System.out.println("-------------------");
        System.out.println("Duration : " + duration);
    }

    private static final int[][] test1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    private static final int[][] test2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
    private static final int[][] test3 = {{5}};

    private static final String s = "Output -> ";

    public static long test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.deepToString(test1));
        System.out.println(diagonalSum(test1));
        System.out.println("25 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.deepToString(test2));
        System.out.println(diagonalSum(test2));
        System.out.println("8 - Expected");

        System.out.println("-------------------");
        System.out.println(Arrays.deepToString(test3));
        System.out.println(diagonalSum(test3));
        System.out.println("5 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
