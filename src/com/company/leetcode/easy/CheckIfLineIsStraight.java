package com.company.leetcode.easy;

public class CheckIfLineIsStraight {
    public static boolean checkStraightLine(int[][] coordinates) {
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];

        for (int i = 1; i < coordinates.length; i++) {
            int x = coordinates[i][0] - coordinates[i - 1][0];
            int y = coordinates[i][1] - coordinates[i - 1][1];

            if (y * xDiff != x * yDiff) {
                return false;
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

    private static final int[][] test1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
    private static final int[][] test2 = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

    public static long test() {
        long startTime = System.nanoTime();

        System.out.println("{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}");
        System.out.println(checkStraightLine(test1));
        System.out.println("true - Expected");

        System.out.println("-------------------");

        System.out.println("{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}}");
        System.out.println(checkStraightLine(test2));
        System.out.println("false - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
