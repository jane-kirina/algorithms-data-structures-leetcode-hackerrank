package com.company.leetcode.easy;

public class FirstUniqueCharInString {
    public static int firstUniqChar(String s) {
        int index = -1;

        for(char c : s.toCharArray()) {
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                return s.indexOf(c);
            }
        }

        return index;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");

    }

    private static final String test1 = "leetcode";
    private static final String test2 = "loveleetcode";
    private static final String test3 = "aabb";
    private static final String s = "Output -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(s + firstUniqChar(test1));
        System.out.println("Expected: 0");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(s + firstUniqChar(test2));
        System.out.println("Expected: 2");

        System.out.println("-------------------");

        System.out.println(test3);
        System.out.println(s + firstUniqChar(test3));
        System.out.println("Expected: -1");


        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("-------------------");
        System.out.println("Duration: " + duration);
    }
}
