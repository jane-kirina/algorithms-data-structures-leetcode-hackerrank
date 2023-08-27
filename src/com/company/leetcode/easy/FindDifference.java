package com.company.leetcode.easy;

public class FindDifference {
    public static char findTheDifference(String s, String t) {
        int num = 0;

        for (int c : s.toCharArray()) {
            num -= c;
        }
        for (int c : t.toCharArray()) {
            num += c;
        }

        return (char) (num);
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");

    }

    private static final String test11 = "abcd";
    private static final String test12 = "abcde";

    private static final String test21 = "";
    private static final String test22 = "y";

    private static final String s = "Output -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(s + findTheDifference(test11, test12));
        System.out.println("Expected: 'e'");

        System.out.println("-------------------");

        System.out.println(s + findTheDifference(test21, test22));
        System.out.println("Expected: 'y'");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
