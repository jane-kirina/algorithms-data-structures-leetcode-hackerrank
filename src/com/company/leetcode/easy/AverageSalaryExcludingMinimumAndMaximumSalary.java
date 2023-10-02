package com.company.leetcode.easy;

import java.util.Arrays;

public class AverageSalaryExcludingMinimumAndMaximumSalary {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int total = 0;

        for (int i = 1; i < salary.length - 1; i++) {
            total = total + salary[i];
        }

        return (double) total / (salary.length - 2);
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long duration = test();
        System.out.println("-------------------");
        System.out.println("Duration : " + duration);
    }

    private static final int[] test1 = {4000, 3000, 1000, 2000};
    private static final int[] test2 = {1000, 2000, 3000};

    public static long test() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(average(test1));
        System.out.println("2500.00000 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(average(test2));
        System.out.println("2000.00000 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
