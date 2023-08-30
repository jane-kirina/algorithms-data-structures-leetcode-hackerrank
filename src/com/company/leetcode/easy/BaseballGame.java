package com.company.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;

public class BaseballGame {
    public static int calPointsStack(String[] operations) {
        ArrayDeque<Integer> points = new ArrayDeque();
        int sum = 0;

        for (String operation : operations) {
            if (Objects.equals("D", operation)) {
                points.push(points.peek() * 2);
            } else if (Objects.equals("C", operation)) {
                points.pop();
            } else if (Objects.equals("+", operation)) {
                int val1 = points.pop();
                int val2 = points.peek();
                points.push(val1);
                points.push(val1 + val2);
            } else {
                points.push(Integer.parseInt(operation));
            }
        }
        for (int num : points) {
            sum += num;
        }

        return sum;
    }


    public static int calPointsLoop(String[] operations) {
        int sum = 0;
        int[] points = new int[operations.length];
        int count = 0;

        for (String operation : operations) {
            switch (operation) {
                case "D":
                    points[count] = 2 * points[count - 1];
                    count++;
                    break;
                case "C":
                    points[--count] = 0;
                    break;
                case "+":
                    points[count] = points[count - 1] + points[count - 2];
                    count++;
                    break;
                default:
                    points[count] = Integer.parseInt(operation);
                    count++;
                    break;
            }
        }

        for (int i : points) {
            sum += i;
        }

        return sum;
    }


    /**
     * TEST
     **/
    public static void main(String[] args) {
        long durationEasy = testStack();
        long durationLoop = testLoop();
        System.out.println("-------------------");
        System.out.println("Duration EASY: " + durationEasy);
        System.out.println("Duration LOOP: " + durationLoop);
    }

    private static final String[] test1 = {"5", "2", "C", "D", "+"};
    private static final String[] test2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
    private static final String[] test3 = {"1", "C"};
    private static final String s = "Output -> ";

    public static long testStack() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(calPointsStack(test1));
        System.out.println("30 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(calPointsStack(test2));
        System.out.println("27 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test3));
        System.out.println(calPointsStack(test3));
        System.out.println("0 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long testLoop() {
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(test1));
        System.out.println(calPointsLoop(test1));
        System.out.println("30 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test2));
        System.out.println(calPointsLoop(test2));
        System.out.println("27 - Expected");

        System.out.println("-------------------");

        System.out.println(Arrays.toString(test3));
        System.out.println(calPointsLoop(test3));
        System.out.println("0 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
