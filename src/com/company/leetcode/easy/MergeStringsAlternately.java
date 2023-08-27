package com.company.leetcode.easy;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        testNaive();
        System.out.println("-------------------");

    }

    private static final String test11 = "abc";
    private static final String test12 = "pqr";

    private static final String test21 = "ab";
    private static final String test22 = "pqrs";

    private static final String test31 = "abcd";
    private static final String test32 = "pq";

    private static final String s = "Output -> ";

    public static void testNaive() {
        long startTime = System.nanoTime();

        System.out.println(s + mergeAlternately(test11, test12));
        System.out.println("Expected: 'apbqcr'");

        System.out.println("-------------------");

        System.out.println(s + mergeAlternately(test21, test22));
        System.out.println("Expected: 'apbqrs'");

        System.out.println("-------------------");

        System.out.println(s + mergeAlternately(test31, test32));
        System.out.println("Expected: 'apbqcd'");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
