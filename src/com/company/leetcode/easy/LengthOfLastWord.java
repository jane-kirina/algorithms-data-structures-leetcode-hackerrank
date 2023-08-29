package com.company.leetcode.easy;

public class LengthOfLastWord {
    public static int lengthOfLastWordEasy(String s) {
        String[] splited = s.split("\\s+");
        return splited[splited.length - 1].length();
    }

    public static int lengthOfLastWordLoop(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--){
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        long durationEasy = testEasy();
        System.out.println("-------------------");
        long durationLoop = testLoop();
        System.out.println("Duration EASY: " + durationEasy);
        System.out.println("Duration LOOP: " + durationLoop);
    }

    private static final String test1 = "Hello World";
    private static final String test2 = "   fly me   to   the moon  ";
    private static final String test3 = "luffy is still joyboy";
    private static final String s = "Output -> ";

    public static long testEasy() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(lengthOfLastWordEasy(test1));
        System.out.println("5 - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(lengthOfLastWordEasy(test2));
        System.out.println("4 - Expected");

        System.out.println("-------------------");

        System.out.println(test3);
        System.out.println(lengthOfLastWordEasy(test3));
        System.out.println("6 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long testLoop() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(lengthOfLastWordLoop(test1));
        System.out.println("5 - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(lengthOfLastWordLoop(test2));
        System.out.println("4 - Expected");

        System.out.println("-------------------");

        System.out.println(test3);
        System.out.println(lengthOfLastWordLoop(test3));
        System.out.println("6 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        return endTime - startTime;
    }
}
