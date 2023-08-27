package com.company.leetcode.easy;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;

        }

        for (char c : ransomNote.toCharArray()) {
            if (arr[c - 'a'] == 0) {
                return false;
            }
            arr[c - 'a']--;
        }

        return true;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");
    }

    private static final String test1ransomNote = "a";
    private static final String test1magazine = "b";
    private static final String test2ransomNote = "aa";
    private static final String test2magazine = "ab";
    private static final String test3ransomNote = "aa";
    private static final String test3magazine = "aab";
    private static final String s = "Output -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(test1ransomNote + " - " + test1magazine);
        System.out.println(s + canConstruct(test1ransomNote, test1magazine));
        System.out.println("Expected: false");

        System.out.println("-------------------");

        System.out.println(test2ransomNote + " - " + test2magazine);
        System.out.println(s + canConstruct(test2ransomNote, test2magazine));
        System.out.println("Expected: false");

        System.out.println("-------------------");

        System.out.println(test3ransomNote + " - " + test3magazine);
        System.out.println(s + canConstruct(test3ransomNote, test3magazine));
        System.out.println("Expected: true");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("-------------------");
        System.out.println("Duration: " + duration);
    }
}
