package com.company.leetcode.easy;

import java.util.HashMap;

public class RobotReturnToOrigin {
    static HashMap<Character, Integer> hashMap = new HashMap<>();

    static {
        hashMap.put('R', 1);
        hashMap.put('L', -1);
        hashMap.put('U', 10);
        hashMap.put('D', -10);
    }

    public static boolean judgeCircleNaive(String moves) {
        int result = 0;

        for (int i = 0; i < moves.length(); i++) {
            result += hashMap.get(moves.charAt(i));
        }

        return result == 0;
    }

    public static boolean judgeCircle2Points(String moves) {
        int x = 0;
        int y = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'R') {
                x++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'U') {
                y--;
            } else if (move == 'D') {
                y++;
            }
        }
        return x == 0 && y == 0;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long durationEasy = testMap();
        long duration2Points = test2Points();
        System.out.println("-------------------");
        System.out.println("Duration EASY  : " + durationEasy);
        System.out.println("Duration POINTS: " + duration2Points);
    }

    private static final String test1 = "UD";
    private static final String test2 = "LL";
    private static final String s = "Output -> ";

    public static long testMap() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(judgeCircleNaive(test1));
        System.out.println("true - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(judgeCircleNaive(test2));
        System.out.println("false - Expected");


        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
    public static long test2Points() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(judgeCircle2Points(test1));
        System.out.println("true - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(judgeCircle2Points(test2));
        System.out.println("false - Expected");


        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
