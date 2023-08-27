package com.company.leetcode.easy;

public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String substring = doubled.substring(1, doubled.length() - 1);
        return substring.contains(s);
    }

    public static boolean repeatedSubstringPatternLoop(String s) {
        int len = s.length();
        for (int i = len / 2; i > 0; i--) {
            if (len % i == 0 && s.charAt(i - 1) == s.charAt(len - 1)) {
                if (s.substring(0, i).repeat(len / i).equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        testNaive();
        System.out.println("-------------------");
        testLoop();
        System.out.println("-------------------");
    }

    private static final String test1 = "abab";

    private static final String test2 = "aba";
    private static final String test3 = "abcabcabcabc";

    private static final String s = "Output -> ";

    public static void testNaive() {
        long startTime = System.nanoTime();

        System.out.println(s + repeatedSubstringPattern(test1));
        System.out.println("Expected: true");

        System.out.println("-------------------");

        System.out.println(s + repeatedSubstringPattern(test2));
        System.out.println("Expected: false");

        System.out.println("-------------------");

        System.out.println(s + repeatedSubstringPattern(test3));
        System.out.println("Expected: true");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }

    public static void testLoop() {
        long startTime = System.nanoTime();

        System.out.println(s + repeatedSubstringPatternLoop(test1));
        System.out.println("Expected: true");

        System.out.println("-------------------");

        System.out.println(s + repeatedSubstringPatternLoop(test2));
        System.out.println("Expected: false");

        System.out.println("-------------------");

        System.out.println(s + repeatedSubstringPatternLoop(test3));
        System.out.println("Expected: true");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
