package com.company.leetcode.easy;

public class ValidPalindrome {
    public static boolean isPalindromeNaive(String s) {
        String string = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder reverse = new StringBuilder();
        reverse.append(string);
        reverse.reverse();

        return string.equals(reverse.toString());
    }

    public static boolean isPalindromeArray(String s) {
        String string = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = string.length() - 1;

        while (start <= end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }

            start += 1;
            end -= 1;
        }

        return true;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        naiveTest();
        System.out.println("-------------------");
        arrayTest();
        System.out.println("-------------------");

    }

    public static void naiveTest() {
        long startTime = System.nanoTime();
        System.out.println("'A man, a plan, a canal: Panama' --- " + isPalindromeNaive("A man, a plan, a canal: Panama"));
        System.out.println("'race a car' --- " + isPalindromeNaive("race a car"));
        System.out.println("'ab_a' --- " + isPalindromeNaive("ab_a"));
        System.out.println("' ' - " + isPalindromeNaive(" "));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }

    public static void arrayTest() {
        long startTime = System.nanoTime();
        System.out.println("'A man, a plan, a canal: Panama' --- " + isPalindromeArray("A man, a plan, a canal: Panama"));
        System.out.println("'race a car' --- " + isPalindromeArray("race a car"));
        System.out.println("'ab_a' --- " + isPalindromeArray("ab_a"));
        System.out.println("' ' - " + isPalindromeArray(" "));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
