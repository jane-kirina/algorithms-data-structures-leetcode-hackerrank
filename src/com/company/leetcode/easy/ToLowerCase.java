package com.company.leetcode.easy;

public class ToLowerCase {
    public static String toLowerCaseEasy(String s) {
        return s.toLowerCase();
    }

    public static String toLowerCaseLoop(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z')
                charArray[i] = (char) (charArray[i] + 32);
        }
        return new String(charArray);
    }

    public static String toLowerCaseStringBuilder(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) ((int) (c) | 32);
            }
            result.append(c);
        }
        return result.toString();
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long durationEasy = testEasy();
        System.out.println("-------------------");
        long durationLoop = testLoop();
        System.out.println("-------------------");
        long durationStringBuilder = testStringBuilder();
        System.out.println("Duration EASY:          " + durationEasy);
        System.out.println("Duration LOOP:          " + durationLoop);
        System.out.println("Duration StringBuilder: " + durationStringBuilder);
    }

    private static final String test1 = "Hello";
    private static final String test2 = "here";
    private static final String test3 = "LOVELY";
    private static final String s = "Output -> ";

    public static long testEasy() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(toLowerCaseEasy(test1));
        System.out.println("hello - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(toLowerCaseEasy(test2));
        System.out.println("here - Expected");

        System.out.println("-------------------");

        System.out.println(test3);
        System.out.println(toLowerCaseEasy(test3));
        System.out.println("lovely - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long testLoop() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(toLowerCaseLoop(test1));
        System.out.println("hello - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(toLowerCaseLoop(test2));
        System.out.println("here - Expected");

        System.out.println("-------------------");

        System.out.println(test3);
        System.out.println(toLowerCaseLoop(test3));
        System.out.println("lovely - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long testStringBuilder() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(toLowerCaseStringBuilder(test1));
        System.out.println("hello - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(toLowerCaseStringBuilder(test2));
        System.out.println("here - Expected");

        System.out.println("-------------------");

        System.out.println(test3);
        System.out.println(toLowerCaseStringBuilder(test3));
        System.out.println("lovely - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
