package com.company.leetcode.easy;

public class FindIndexOfFirstOccurrenceInString {
    public static int strStrEasy(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        System.out.println("    EASY");
        testEasy();
        System.out.println("-------------------");
    }

    private static final String test11 = "sadbutsad";
    private static final String test12 = "sad";

    private static final String test21 = "leetcode";
    private static final String test22 = "leeto";

    private static final String s = "Output -> ";

    public static void testEasy() {
        long startTime = System.nanoTime();

        System.out.println(s + strStrEasy(test11, test12));
        System.out.println("Expected: 0");

        System.out.println("-------------------");

        System.out.println(s + strStrEasy(test21, test22));
        System.out.println("Expected: -1");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
